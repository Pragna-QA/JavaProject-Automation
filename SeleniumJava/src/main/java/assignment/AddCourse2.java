package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import helper.Utility;

public class AddCourse2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("admin@email.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("admin@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		
		
		WebElement menu=driver.findElement(By.xpath("//div[@class='nav-menu-item-manage']"));
		
		
		Actions act = new Actions(driver);
		
		act.moveToElement(menu).perform();
		
		
		
		driver.findElement(By.xpath("//div[@class='nav-menu-item-manage']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@class='nav-menu-item-hover-div']//a[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Add New Course ']")).click();
		
		
		Thread.sleep(3000);
		
		
		//Uploading correct image
		driver.findElement(By.id("thumbnail")).sendKeys("C:\\Users\\saipr\\OneDrive\\Desktop\\CyberSecurity.jpg");
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Sai Pragna");
		
		driver.findElement(By.id("description")).sendKeys("Cyber Security Course");
		
		driver.findElement(By.xpath("//input[@name='instructorName']")).sendKeys("Sai Pragna");
		
		driver.findElement(By.xpath("//input[@name='price']")).clear();
		driver.findElement(By.xpath("//input[@name='price']")).sendKeys("3500");
		
		driver.findElement(By.xpath("//div[@class='react-datepicker-wrapper']")).click();
		
		//Thread.sleep(1000)
		
		
		Utility.selectValueFromList(driver, "//div[@aria-label='Choose Saturday, April 29th, 2023']", "29");
		
		//Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//input[@name='endDate']")).click();
		
		Thread.sleep(1000);
		Utility.selectValueFromList(driver, "//div[@aria-label='Choose Monday, May 29th, 2023']", "29");
		
		driver.findElement(By.xpath("//div[normalize-space()='Select Category']")).click();
		
		driver.findElement(By.xpath("//button[text()='Cyber Security']")).click();
		
		driver.findElement(By.xpath("//button[@class='action-btn']")).click();
		
		
		
		

	}

}
