package captureScreenshot;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import helper.Utility;

public class CaptureScreenshots1 {

	public static void main(String[] args) {
		
		
		WebDriver driver =Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
		
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//Store in temp location
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\saipr\\eclipse-workspace\\2023\\SeleniumJava\\Screenshotscreenshot2.png");
		
		try 
		{
			FileHandler.copy(src, dest);
		} 
		catch (IOException e) 
		{	
			System.out.println("Exception "+e.getMessage());
		}
		
		driver.quit();
		
		
	
		
		
		
		
		

	}

}
