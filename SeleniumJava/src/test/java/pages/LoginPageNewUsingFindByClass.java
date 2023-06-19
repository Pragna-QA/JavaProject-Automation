package pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.PageFactory;


/*
 * This Class is used only for learning, @FindBy @CacheLookup
 * 
 * 
 * 
 */

public class LoginPageNewUsingFindByClass 
{

	protected WebDriver driver;
	
	public LoginPageNewUsingFindByClass(WebDriver driver) 
	{
		this.driver = driver;  //Here we are using WebDriver name as driver and Arguments for Login Page also driver, That's why we are using "this" keyword.otherwise, if the argument is with different name then we no need to use this.
		PageFactory.initElements(driver, this);
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
	
	@FindBy(id="email1") 
	@CacheLookup
	WebElement username;
	//private By username = By.id("email1");
		
	
	//private By password = By.id("password1");
	@FindBy(id="password1") WebElement password;
	
		
	//private By loginButton = By.className("submit-btn");
	@FindBy(className = "submit-btn") WebElement loginButton;
	
		
	@FindBy(className="errorMessage") WebElement errorMessage;
	//driver.findElement(By.className(""));
	//private By errorMessage = By.className("errorMessage");
	
	
	public void loginToApplication(String uname, String pass)
	{	
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
