package assignment;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ManageCategoriesAssignment2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("admin@email.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("admin@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		//driver.findElement(By.xpath("//div[@class='nav-menu-item-manage']"));
		
		
		// It will return the parent window name as a String
		
		
		driver.findElement(By.xpath("//div[@class='nav-menu-item-manage']")).click();
		
		driver.findElement(By.xpath("//div[@class='nav-menu-item-hover-div']//a[2]")).click();
		
		
		
		
		// This will return the number of windows opened by Webdriver and will return Set of St//rings
		
		String parent=driver.getWindowHandle();
		Set<String> child=driver.getWindowHandles();
		
		for (String handle : child) 
		{
			System.out.println(handle);
			if(!handle.equals(parent))
			{
				driver.switchTo().window(handle);
				Thread.sleep(2000);
				
				//To Update the Category Name
				driver.findElement(By.xpath("//tbody/tr[6]/td[3]/button[1]")).click();
				Thread.sleep(5000);
				Alert alt = driver.switchTo().alert();
				alt.sendKeys("Web Development_Pragna");
				alt.accept();
				Thread.sleep(2000);
				
				//To Delete the Category Name
				driver.findElement(By.xpath("(//button[@class='action-btn delete-btn'][normalize-space()='Delete'])[7]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='action-btn'][normalize-space()='Delete']")).click();
				
				
						
			}
			
		}
		
		
		
		
		
		
		
		
		
	}

}


