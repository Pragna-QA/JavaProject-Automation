package waitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitInSelenium {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//PageLoad - 300, Script - 30, Implicit Wait - 0
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); //By Default - 300 seconds(5 mins)
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10)); //By Default - 30 Seconds
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		
		// Element Should be present and Visible
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //By Default  - 0 Seconds
		driver.findElement(By.xpath("//input[@name='email1']")).sendKeys("pragna@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		//driver.quit();
		

	}

}
