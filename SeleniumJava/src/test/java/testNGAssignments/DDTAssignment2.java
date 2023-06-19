package testNGAssignments;


//import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import helper.Utility;

public class DDTAssignment2 
{

	WebDriver driver;
	
	//this will get executed before each and every method
	
	@BeforeMethod
	public void setupBrowser() throws InterruptedException
	{
		System.out.println("LOG:INFO - Running Before Method");
		System.out.println("LOG:INFO - Browser Getting Started");
		driver=Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/signup");
		Thread.sleep(5000);
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
	
	
	
	
	@Test(dataProvider = "loginDataFromExcel", dataProviderClass = CustomerDataProvider1.class)
	public void test1(String name, String email, String password, String interests, String gender, String state, String hobbies) throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		
		WebElement xpath = driver.findElement(By.xpath("//label[normalize-space()='"+interests+"']"));
		xpath.click();
		
		WebElement gen = driver.findElement(By.xpath("//input[@value='"+gender+"']"));
		
		gen.click();
		
		WebElement state1 = driver.findElement(By.name("state"));
		Select stateDD = new Select(state1);
		stateDD.selectByValue(state);
		
		WebElement hobbies1 = driver.findElement(By.id("hobbies"));
		Select hobbiesDD = new Select(hobbies1);
		hobbiesDD.selectByValue(hobbies);
		
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		String ExpectedURL = "https://freelance-learn-automation.vercel.app/login";
		String url = driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		Assert.assertEquals(url, ExpectedURL);
		
		driver.quit();
	}
	
}
