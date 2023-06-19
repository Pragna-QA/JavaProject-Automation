package captureScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import helper.Utility;

public class CaptureScreenhotOfWebElement {

	public static void main(String[] args) {
		
		WebDriver driver = Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
		
		File src = driver.findElement(By.id("email")).getScreenshotAs(OutputType.FILE);
		
		try {
			FileHandler.copy(src, new File("./screenshot/WebElement_"+Utility.getCurrentDate()+".png"));
		} catch (IOException e) {
			System.out.println("Cannot take the screenshot of the WebElement");	
		}
		
		driver.quit();

	}

}
