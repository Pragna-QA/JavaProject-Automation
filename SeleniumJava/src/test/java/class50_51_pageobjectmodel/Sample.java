package class50_51_pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sample 
{
	
	public static void main (String[] args)
	{
		System.getProperty("webdriver.chrome.logfile", "./chromelog.txt");
		System.setProperty("webdriver.chrome.verboseLogging", "true");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("");
		driver.quit();
	}

}
