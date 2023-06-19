package waitsInSelenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Utility;

public class WebDriverWaitExample2 {
	
	// PageLoad 300 Script 30 ImplitWait 0

	public static void main(String[] args) {
		
		WebDriver driver=Utility.startBrowser("Chrome", "http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
	
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		// presence + visible +enabled
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='WebDriver']")));
		
		
		if(element.isDisplayed())
		{
			System.out.println("Found ... !!!");
		}
		else
		{
			System.out.println("Failed ... !!!");
		}
		
		// presence + visible
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		
		// presence 
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		
		
		
		driver.quit();
		
	}
}






// Go to login Page ---> Click on New user--->Wait untill the loader is not disappeared