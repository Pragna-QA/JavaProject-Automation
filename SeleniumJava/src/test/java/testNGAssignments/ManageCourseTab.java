package testNGAssignments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import helper.Utility;

public class ManageCourseTab 
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
		Thread.sleep(5000);
		String ExpectedUrl = "https://freelance-learn-automation.vercel.app/";
		String AfterLogin = driver.getCurrentUrl();
		System.out.println("The Actual URL After Login is : " + AfterLogin);
		Assert.assertEquals(AfterLogin, ExpectedUrl);
		System.out.println("The Expected URL After Login is: "+ ExpectedUrl);
		driver.findElement(By.xpath("(//div[@class='nav-menu-item-manage'])[1]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Manage Courses']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Add New Course']")).click();
		driver.findElement(By.id("thumbnail")).sendKeys("C:\\Users\\saipr\\OneDrive\\Desktop\\WebDevelopment.jpg");	
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Sai Pragna");	
		driver.findElement(By.id("description")).sendKeys("This is an Web Development Course");	
		driver.findElement(By.xpath("//input[@name='instructorName']")).sendKeys("Sai Pragna");
		driver.findElement(By.xpath("//input[@name='price']")).clear();
		driver.findElement(By.xpath("//input[@name='price']")).sendKeys("4500");
		driver.findElement(By.xpath("//div[@class='react-datepicker-wrapper']")).click();
		Utility.selectValueFromList(driver, "(//div[@aria-label='Choose Tuesday, May 23rd, 2023'])[1]", "23");
		driver.findElement(By.xpath("//input[@name='endDate']")).click();		
		Thread.sleep(1000);
		Utility.selectValueFromList(driver, "(//div[@aria-label='Choose Friday, June 23rd, 2023'])[1]", "23");
		driver.findElement(By.xpath("//div[normalize-space()='Select Category']")).click();		
		driver.findElement(By.xpath("//button[normalize-space()='Web Development']")).click();
		driver.findElement(By.xpath("//button[@class='action-btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[name()='svg'])[4]")).click();	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement signout=driver.findElement(By.xpath("//button[@class='nav-menu-item']"));
		js.executeScript("arguments[0].scrollIntoView(true)", signout);
		signout.click();
		String ExpectedAfterLogoutUrl = "https://freelance-learn-automation.vercel.app/login";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.urlContains(ExpectedAfterLogoutUrl));
		String LogoutUrl = driver.getCurrentUrl();
		Assert.assertEquals(LogoutUrl, ExpectedAfterLogoutUrl);
		System.out.println("The Actual URL after Logout is: "+LogoutUrl);
		System.out.println("The Expected URL After User Logout is : "+ ExpectedAfterLogoutUrl);
		driver.quit();

}
}
