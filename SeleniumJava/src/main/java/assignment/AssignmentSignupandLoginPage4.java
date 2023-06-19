package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentSignupandLoginPage4 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://freelance-learn-automation.vercel.app/signup");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("SaiPragna");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pragna@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Daddy@123");
		
		Thread.sleep(2000);
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkbox.size());
		
		for(int i=0;i<checkbox.size();i++)
		{
			checkbox.get(i).click();
		}
		
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@name='gender']")).getAttribute("name");
		//driver.findElement(By.id("gender2")).click();
		driver.findElement(By.xpath("//input[@value='Female']")).click();
		
		WebElement state = driver.findElement(By.name("state"));
		Select stateDD = new Select(state);
		stateDD.selectByVisibleText("Karnataka");
		Thread.sleep(2000);
		
		WebElement hobbies = driver.findElement(By.id("hobbies"));
		Select hobbiesDD = new Select(hobbies);
		hobbiesDD.selectByValue("Singing");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='email1']")).sendKeys("pragna@gmail.com");
		
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Daddy@123");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='submit-btn']")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		
		

	}

}
