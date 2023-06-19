package class50_51_pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import helper.Utility;
import pages.LoginPage;

public class LoginApp2 
{

	@Test
	public void loginToApplicationWithNonExistingUser()
	{
		WebDriver driver=Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
		/*
		 *  Page Factory
		 *  		Either maintain PageFactory in TestClass
		 *  		Either maintain PageFactory in Page
		 * 
		 */
		
		//LoginPage login = new LoginPage(driver);
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		//LoginPage log = PageFactory.initElements(driver, LoginPage.class);
		//log.loginToApplication(null, null);
		login.loginToApplication("asbc@gmail.com", "Pragna@123");	
		Assert.assertTrue(login.captureErrorMessage().contains("USER Email Doesn't Exist"));
		driver.quit();
	}
}
