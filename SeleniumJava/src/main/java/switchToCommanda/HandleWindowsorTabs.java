package switchToCommanda;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.Utility;

public class HandleWindowsorTabs {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		// XPath 
				// Matching with //a[contains(@href,'linkedin')]
				// Matching with one (//a[contains(@href,'linkedin')])[1]
		
		driver.findElements(By.xpath("//a[contains(@href, 'linkedin')]")).get(0).click();
		
		//driver.findElement(By.xpath("//a[contains(@href, 'linkedin')][1]")).click();
		
		String parent = driver.getWindowHandle();
		
		Set<String> allwindows = driver.getWindowHandles();
		
		
		Iterator<String> itr=allwindows.iterator();
		
		while (itr.hasNext()) 
		{
			String child=itr.next();
			
				if (!child.equals(parent)) 
				{
					//driver.switchTo().window("Selenium");
					driver.switchTo().window(child);
					//driver.findElement(By.name("email-or-phone")).sendKeys("pragna@gmail.com");
					driver.close();
				
				}
			
		}
		
		driver.switchTo().window(parent);
		driver.findElement(By.id("email1")).sendKeys("email@email.com");		
		driver.quit();

	}

}
