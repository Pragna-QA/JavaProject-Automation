package webDriverDemo;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Options;
//import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsCommands {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.expedia.com/");
		
		driver.get("https://www.google.com/");
		
		driver.navigate().back();
		
		//session ID - Closes the browser or current tab but session id is available for a browser
		driver.close();
		
		//Close all tabs and windows , session id will be null Multiple session then close in the middle and quit will be the last
		driver.quit();
		
		driver.navigate().refresh();
		
	/*	
		Options opt = driver.manage();
		Window win = opt.window();
		win.maximize();
		
	*/

	}

}
