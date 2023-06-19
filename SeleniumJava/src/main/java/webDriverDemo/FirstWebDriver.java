package webDriverDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstWebDriver {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		
		//Open WebPage
		driver.get("https://www.google.com/");
		
		//To get the title 
		driver.getTitle();
		
		//Find Single Webelement
		driver.findElement(null);
		
		//Find Multiple Webelements
		driver.findElements(null);
		
		//To get the Current URL - add assertion
		driver.getCurrentUrl();
		
		
		//To handle current Window or Window ID used while window switching
		driver.getWindowHandle();
		
		
		//To handle multiple Windows or Window ID's, All window handles we will get using Set
		driver.getWindowHandles();
		
		
		//Page Source - add assertion
		driver.getPageSource();
		
		//To Navigate the Page forward and Backward
		driver.navigate().back();
		driver.navigate().forward();
		
		//Manage Window Preferences
		driver.manage().window();
		
		//To Maximize the current Window
		driver.manage().window().maximize();
		
		//timeout interface for certain timeouts
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//Used while performing the switching - Switch to commands
		driver.switchTo();
		driver.switchTo().alert();
		driver.switchTo().window(null);
		driver.switchTo().frame(0);
		
		//Close all association windows
		driver.quit();
		
		//Close current Window
		driver.close();
		

	}

}
