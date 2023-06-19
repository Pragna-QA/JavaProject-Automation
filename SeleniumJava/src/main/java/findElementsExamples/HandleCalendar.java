package findElementsExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.Utility;

public class HandleCalendar {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		//Utility.selectValueFromList(driver, "//table[@class='ui-datepicker-calendar']//a", "26");
		Utility.selectValueFromList(driver, By.xpath("//table[@class='ui-datepicker-calendar']//a"), "30");

		//driver.close();

	}

}
