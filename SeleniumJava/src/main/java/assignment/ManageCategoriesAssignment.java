package assignment;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ManageCategoriesAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("admin@email.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("admin@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//div[@class='nav-menu-item-manage']"));
		
		
		// It will return the parent window name as a String
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='nav-menu-item-manage']")).click();
		
		driver.findElement(By.xpath("//div[@class='nav-menu-item-hover-div']//a[2]")).click();
		
		Thread.sleep(3000);
		
		
		// This will return the number of windows opened by Webdriver and will return Set of Strings
		
		String parent=driver.getWindowHandle();
		Set<String> child=driver.getWindowHandles();
		
		for (String handle : child) 
		{
			System.out.println(handle);
			if(!handle.equals(parent))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("//button[normalize-space()='Add New Category']")).click();
				driver.switchTo().alert().sendKeys("Cyber Security_SaiPragna");
				Thread.sleep(2000);
				driver.switchTo().alert().accept();
				Thread.sleep(1000);
				
				
				
			}
			
		}
		
		
		
		
		
		
		
	}

}


