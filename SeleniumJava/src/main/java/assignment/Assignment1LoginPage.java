package assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1LoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.name("email1"));
		username.sendKeys("admin@email.com");
		
		WebElement password=driver.findElement(By.id("password1"));
		password.sendKeys("admin@123");
		
		
		WebElement signin=driver.findElement(By.className("submit-btn"));
		signin.click();
		
		Thread.sleep(5000);
	
		driver.close();

	}

}
