package class50_51_pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
import org.testng.annotations.Test;
import helper.Utility;
import pages.LoginPage;
import pages.RegisterPage;

public class LoginApp4 
{

	@Test
	public void loginToApplicationWithNonExistingUser() throws InterruptedException
	{
		
		WebDriver driver = Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		LoginPage login = new LoginPage(driver);		
		RegisterPage register=login.clickOnNewUserLink();	
		Thread.sleep(6000);
		register.createUser();
		driver.quit();
		
	}
	
}
