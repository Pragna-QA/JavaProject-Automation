package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage 
{
	
	protected WebDriver driver;
	
	public RegisterPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By firstName = By.id("name");
	private By email = By.id("email");
	private By password = By.id("password");
	//private By courses = By.id("63d176c7129d0b808b9bee8e");
	//private By courses = By.xpath("//label[normalize-space()='App Development']");
	private By interests = By.xpath("//input[@type='checkbox']");
	private By gender = By.id("gender2");
	private By state1 = By.id("state");
	private By hobbies1 = By.id("hobbies");
	//private By submitButton = By.className("submit-btn");
		
	
	
	public void createUser() throws InterruptedException 
	{
		
		driver.findElement(firstName).sendKeys("RajeshPragna");
		driver.findElement(email).sendKeys("pragna90@gmail.com");
		driver.findElement(password).sendKeys("Daddy@123");
		//driver.findElement(courses).click();
		//List<WebElement> course=driver.findElements(interests);
		//for (WebElement ele : course) 
		//{
			//if(ele.equals(interests))
			//{
				//ele.click();
				//break;
			//}
			
		//}
		
		driver.findElement(interests).click();
		driver.findElement(gender).click();
		driver.findElement(state1).sendKeys("Karnataka");
		driver.findElement(hobbies1).sendKeys("Singing");
		Thread.sleep(6000);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();;
		//driver.quit();		
		
	}


}
