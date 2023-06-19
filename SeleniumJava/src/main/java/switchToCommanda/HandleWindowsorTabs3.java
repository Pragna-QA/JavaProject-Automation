package switchToCommanda;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.Utility;

public class HandleWindowsorTabs3 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> allLinks=driver.findElements(By.xpath("//div[@class='social-btns']//a"));
		
		for (int i = 0; i < 4; i++) 
		{
			allLinks.get(i).click();
			
		}
		
		Set<String> allWindows = driver.getWindowHandles();
		
		List<String> allWindowsInList=new ArrayList<String>(allWindows);
		
		Thread.sleep(2000);
		
		// switch to second tab
		driver.switchTo().window(allWindowsInList.get(1));
		
		Thread.sleep(2000);
		
		//switch to fourth tab
		driver.switchTo().window(allWindowsInList.get(3));
		
		Thread.sleep(2000);
		
		//switch to last tab		
		driver.switchTo().window(allWindowsInList.get(allWindowsInList.size()-1));
		
		Thread.sleep(2000);

		driver.switchTo().window(allWindowsInList.get(0));
		
		driver.findElement(By.id("email1")).sendKeys("email@email.com");
		
		driver.quit();
		
		
	}
}