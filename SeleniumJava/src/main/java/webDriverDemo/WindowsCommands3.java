package webDriverDemo;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Options;
//import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsCommands3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		WebDriver driver1 = new EdgeDriver();
		
		WebDriver driver2 = new FirefoxDriver();
		
		driver.get("https://www.expedia.com/");
		
		Thread.sleep(7000);
		
		driver.manage().window().maximize();
		
		
		
		driver.quit();
		
		driver1.quit();
		
		driver2.quit();
		
		
	}

}
