package assignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import helper.Utility;

public class ManageCourseAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
		
		
		//Uploading PDF Document
		driver.findElement(By.id("thumbnail")).sendKeys("C:\\Users\\saipr\\OneDrive\\Desktop\\SQL-cheat-sheet.pdf");
		
		Thread.sleep(2000);
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		
		//Uploading image which is morethan 1MB
		driver.findElement(By.id("thumbnail")).sendKeys("C:\\Users\\saipr\\OneDrive\\Desktop\\500MBExceed.jpg");
		
		Thread.sleep(2000);
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		
		//Uploading correct image
		driver.findElement(By.id("thumbnail")).sendKeys("C:\\Users\\saipr\\OneDrive\\Desktop\\AutomationTesting.png");
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Sai Pragna");
		
		driver.findElement(By.id("description")).sendKeys("This is an Automation Testing Course");
		
		driver.findElement(By.xpath("//input[@name='instructorName']")).sendKeys("Sai Pragna");
		
		driver.findElement(By.xpath("//input[@name='price']")).clear();
		driver.findElement(By.xpath("//input[@name='price']")).sendKeys("5000");
		
		driver.findElement(By.xpath("//div[@class='react-datepicker-wrapper']")).click();
		
		//Thread.sleep(1000)
		
		
		Utility.selectValueFromList(driver, "//div[@aria-label='Choose Monday, May 1st, 2023']", "1");
		
		//Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//input[@name='endDate']")).click();
		
		Thread.sleep(1000);
		Utility.selectValueFromList(driver, "(//div[@aria-label='Choose Wednesday, May 31st, 2023'])[1]", "31");
		
		driver.findElement(By.xpath("//div[normalize-space()='Select Category']")).click();
		
		driver.findElement(By.xpath("//button[text()='Automation Testing']")).click();
		
		driver.findElement(By.xpath("//button[@class='action-btn']")).click();		

	}

}
