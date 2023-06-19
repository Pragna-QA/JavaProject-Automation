package webDriverDemo;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Options;
//import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsCommands2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver = new EdgeDriver();
		driver = new FirefoxDriver();
		
		driver.get("https://www.expedia.com/");
		
		driver.manage().window().maximize();
		
		driver.quit();
		
		
	}

}
