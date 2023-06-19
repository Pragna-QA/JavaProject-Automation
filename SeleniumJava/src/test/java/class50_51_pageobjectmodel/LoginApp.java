package class50_51_pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import helper.Utility;
import pages.LoginPage;

public class LoginApp 
{

	@Test
	public void loginToApplicationWithNonExistingUser()
	{
		WebDriver driver = Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");	
		//Without PageFactory		
		LoginPage login = new LoginPage(driver);
		login.loginToApplication("asbc@gmail.com", "Pragna@123");	
		Assert.assertTrue(login.captureErrorMessage().contains("USER Email Doesn't Exist"));
		driver.quit();
		
	}
	
	@Test
	public void loginToApplicationWithoutNonExistingUser()
	{
		WebDriver driver = Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
		LoginPage login = new LoginPage(driver);
		login.loginToApplication("pragna@gmail.com", "Pragna@123");
		Assert.assertTrue(login.captureErrorMessage().contains("Email and Password Doesn't match"));
		driver.quit();
	}
	
}
