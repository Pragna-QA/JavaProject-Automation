package captureScreenshot;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import helper.Utility;


public class CaptureScreenhotOfWebElement2 {

	public static void main(String[] args) {
		
		WebDriver driver = Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
		
		Utility.captureScreenshotOfWebElement(driver.findElement(By.id("email1")));
		
		driver.quit();

	}

}
