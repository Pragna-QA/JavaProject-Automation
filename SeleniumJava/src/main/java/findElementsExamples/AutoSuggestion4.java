package findElementsExamples;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.Utility;

public class AutoSuggestion4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Selenium");
		Thread.sleep(3000);
		
		Utility.selectValueFromList(driver, "//*[@role='listbox']/li", "python");
		
		}
		
	}
		

	


