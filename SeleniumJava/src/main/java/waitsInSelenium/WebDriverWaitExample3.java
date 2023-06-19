package waitsInSelenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Utility;

public class WebDriverWaitExample3 {
	
	// PageLoad 300 Script 30 ImplitWait 0

	public static void main(String[] args) {
		
		WebDriver driver=Utility.startBrowser("Chrome", "http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
	
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		
		//Important - Whenever we have to wait for the Frame
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("")));
		
		//Wait for title
		wait.until(ExpectedConditions.titleContains("Register"));
		
		
		//Exact title
		wait.until(ExpectedConditions.titleIs(""));
		
		//The Element which is searching is invisible or not present in DOM
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("")));
		
		//Text to be present
		wait.until(ExpectedConditions.textToBePresentInElementValue(By.xpath(""), "Pragna"));
		
		
		
		wait.until(ExpectedConditions.numberOfWindowsToBe(5));
		
		wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath(""), 5));
		
		driver.quit();
		
	}
}