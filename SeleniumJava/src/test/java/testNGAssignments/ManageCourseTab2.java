package testNGAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import helper.Utility;

public class ManageCourseTab2 
{
	@Parameters("Browser")
	@Test
	public void loginApplication(@Optional("Chrome")   String browser) throws InterruptedException
	{
		WebDriver driver = Utility.startBrowser(browser, "https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email1']")).sendKeys("admin@email.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin@123");
		driver.findElement(By.xpath("//button[@class='submit-btn']")).click();
		String ExpectedUrl = "https://freelance-learn-automation.vercel.app/";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.urlContains(ExpectedUrl));
		System.out.println("The Expected URL after Login is: " +ExpectedUrl);
		Assert.assertTrue(true);
	
		
		

}
}
