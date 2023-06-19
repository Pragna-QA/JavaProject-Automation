package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1LoginPage1UsingXPATH {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.xpath("//input[@name='email1']"));
		username.sendKeys("admin@email.com");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin@123");
		
		driver.findElement(By.xpath("//button[@class='submit-btn']")).click();
		
		Thread.sleep(5000);
		driver.close();

	}

}
