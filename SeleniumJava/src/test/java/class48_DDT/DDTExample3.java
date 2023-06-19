package class48_DDT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import helper.Utility;

public class DDTExample3 
{
	
	/*
	 * 	Make sure data provider name is correct
	 *  Make sure number of argument should match with number of columns in data provider
	 */
	WebDriver driver;
	
	//this will get executed before each and every method
	
	@BeforeMethod
	public void setupBrowser()
	{
		System.out.println("LOG:INFO - Running Before Method");
		System.out.println("LOG:INFO - Browser Getting Started");
		driver=Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
		System.out.println("LOG:INFO - Browser Started");
	}
	
	
	@Test(dataProvider = "loginDataForApplication", dataProviderClass = CustomDataProvider.class)
	public void test1(String email, String password)
	{
		WebDriver driver=Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
		driver.findElement(By.xpath("//input[@id='email1']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='password1']")).sendKeys(password);
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//h2[@class='errorMessage']"))
				.getText()
				.contains("USER Email Doesn't Exist"),"Error message could not verify");
		
		driver.quit();
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
