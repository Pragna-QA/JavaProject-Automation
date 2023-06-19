package captureScreenshot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import helper.Utility;

public class CaptureScreenshots2 {

	public static void main(String[] args) {
		
		
		WebDriver driver =Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
		
		//File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//TakesScreenshot ts = (TakesScreenshot) driver;
		
		//Store in temp location
		//File src = ts.getScreenshotAs(OutputType.FILE);
		
		//File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		TakesScreenshot ts=(TakesScreenshot)driver;

		try 
		{
			FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File("./screenshot/screenshot1.png"));
			
		} catch (IOException e) {
			
			System.out.println("Exception "+e.getMessage());
		}
		
		driver.quit();

	}

}
