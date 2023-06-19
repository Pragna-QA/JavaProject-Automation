package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

	protected WebDriver driver;
	
	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;  //Here we are using WebDriver name as driver and Arguments for Login Page also driver, That's why we are using "this" keyword.otherwise, if the argument is with different name then we no need to use this.
		//PageFactory.initElements(driver, this);
		//PageFactory.initElements(driver, LoginPage.class);
	}
	
	/*
	 * public LoginPage(WebDriver ldriver)
	 * {
	 * driver = ldriver;
	 * }
	 * Here we are using WebDriver name as driver and Arguments for Login Page also driver, That's why we are using "this" keyword.otherwise, if the argument is with different name then we no need to use this.
	 * 
	 */
	
	
	private By username = By.id("email1");
	private By password = By.id("password1");
	private By loginButton = By.className("submit-btn");
	private By errorMessage = By.className("errorMessage");
	private By newUserLink = By.linkText("New user? Signup");
	
	
	public RegisterPage clickOnNewUserLink() 
	{
		driver.findElement(newUserLink).click();
		RegisterPage page = new RegisterPage(driver);
		return page;	
	}
	
	
	public void loginToApplication(String uname, String pass)
	{
	
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();
	}
	
	public String captureErrorMessage()
	{
		String error_msg = driver.findElement(errorMessage).getText();
		return error_msg;
		
	}
}
