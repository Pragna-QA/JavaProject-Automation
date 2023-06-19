package captureScreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import helper.Utility;

public class CaptureScreenshots4 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
		
		Utility.captureScreenshot(driver);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("pragna@gmail.com");
		
		Utility.captureScreenshot(driver);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("Daddy@123");
		
		Utility.captureScreenshot(driver);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		Utility.captureScreenshot(driver);
		
		driver.quit();

	}
}
