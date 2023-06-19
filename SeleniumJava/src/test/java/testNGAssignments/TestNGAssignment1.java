package testNGAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import helper.Utility;

public class TestNGAssignment1 
{
	@Test(priority = 1)
	public void verifyTitle()
	{
		WebDriver driver=Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		String ExpectedTitle="Learn Automation Courses";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains("Automation"));
		String ActualTitle=driver.getTitle();
		System.out.println("Actual Page Title is: " + ActualTitle);
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		System.out.println("Expected Page Title is : " + ExpectedTitle);
		driver.quit();
		
	}
	
	@Test(priority = 2)
	public void loginInvalid()
	{
		WebDriver driver=Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email1']")).sendKeys("pragna@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Daddy@113");
		driver.findElement(By.xpath("//button[@class='submit-btn']")).click();
		//Email and Password Doesn't match
		String message = "Email and Password Doesn't match" ;
		System.out.println("The Error Message for Invalid Login is: "+message );
		Assert.assertTrue(message.contains("Doesn't"),  "Email and Password Doesn't match");
		driver.quit();
		
	}
	
	
	@Test(priority = 3)
	public void loginLogout() throws InterruptedException
	{
		WebDriver driver=Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		String LoginURL = "https://freelance-learn-automation.vercel.app";
		driver.findElement(By.xpath("//input[@name='email1']")).sendKeys("pragna@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Daddy@123");
		driver.findElement(By.xpath("//button[@class='submit-btn']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		boolean status=wait.until(ExpectedConditions.urlContains(LoginURL));
		Assert.assertTrue(status);	
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='navbar-menu-links']//*[name()='svg']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='nav-menu-item']")).click();
		String ExpectedAfterLogoutUrl = "https://freelance-learn-automation.vercel.app/login";
		Assert.assertTrue(true, ExpectedAfterLogoutUrl);
		String LogoutUrl = driver.getCurrentUrl();
		System.out.println("The URL After User Logout is : "+ LogoutUrl);
		driver.quit();
	
		
	}
	 

}
