package pages;

import java.time.Duration;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.PageFactory;

public class LoginPageUsingHowClass 
{

	protected WebDriver driver;
	
	public LoginPageUsingHowClass(WebDriver driver) 
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
	
	@FindBy(how = How.ID, using = "email1") WebElement username;

	@FindBy(how = How.ID, using = "password1") WebElement password;
	
	@FindBy(how = How.CLASS_NAME, using = "submit-btn") WebElement loginButton;
	
	@FindBy(how = How.CLASS_NAME, using = "errorMessage") WebElement errorMessage;

	
	
	public void loginToApplication(String uname, String pass)
	{	
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(loginButton));
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginButton.click();
	}
	
	public String captureErrorMessage()
	{
		String error_msg =  errorMessage.getText();
		return error_msg;
		
	}
}
