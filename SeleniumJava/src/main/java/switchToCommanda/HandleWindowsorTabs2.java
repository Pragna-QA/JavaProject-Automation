package switchToCommanda;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.Utility;

public class HandleWindowsorTabs2 {

	public static void main(String[] args) {
		
		
		WebDriver driver=Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// XPath 
				// Matching with //a[contains(@href,'linkedin')]
				// Matching with one (//a[contains(@href,'linkedin')])[1]
		
		driver.findElements(By.xpath("//a[contains(@href, 'linkedin')]")).get(0).click();
		
		//driver.findElement(By.xpath("//a[contains(@href, 'linkedin')][1]")).click();
		
		String parent = driver.getWindowHandle();
		System.out.println("Current Window is: "+parent);
		
		Set<String> allwindows = driver.getWindowHandles();
		//System.out.println("All Window Handle is"+allwindows);
		
		
		//1 - Iterator
		
		Iterator<String> itr=allwindows.iterator();
		
		while (itr.hasNext()) 
		{
			String child=itr.next();
			
				if (!child.equals(parent)) 
				{
					driver.switchTo().window(child);
					String title = driver.getTitle();
					System.out.println("Title is " +title);
					driver.findElement(By.name("")).sendKeys("");
					driver.close();
				
				}
			
		}
		
		driver.switchTo().window(parent);
		driver.findElement(By.id("email1")).sendKeys("email@email.com");		
		driver.quit();

	}

}
