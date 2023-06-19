package assignment;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginAndLogout {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
			
		driver.findElement(By.xpath("//input[@name='email1']")).sendKeys("pragna@gmail.com");
		
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Daddy@123");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='submit-btn']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='navbar-menu-links']//*[name()='svg']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='nav-menu-item']")).click(); 
		
		
		Thread.sleep(2000);
		
		
	    //driver.getCurrentUrl();
		
		System.out.println("After Logout it redirects to : " +driver.getCurrentUrl());
		
		driver.close();
		
		
		

	}

}
