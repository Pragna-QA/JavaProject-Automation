package class48_DDT;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import helper.Utility;

public class BaseClass 
{
	
	WebDriver driver;

	@BeforeMethod
	public void setupBrowser()
	{
		System.out.println("LOG:INFO - Running Before Method");
		System.out.println("LOG:INFO - Browser Getting Started");
		driver=Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
		System.out.println("LOG:INFO - Browser Started");
	}

	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("LOG:INFO - Running After Method");
		System.out.println("LOG:INFO - Browser Getting Closed");
		driver.quit();
		System.out.println("LOG:INFO - Browser Closed");
	}


}
