package optionsClassesSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AcceptInsecureApp {

	public static void main(String[] args) {
		
		
		/*
		 *  handle secure application
		 *  handle https application
		 *  handle app where cerificate is invalid
		 *  handle app where cerificate is valid but expired
		 *  handle certificate in selenium
		 * 
		 */
		
		
		/*
		 *  QA- Staging- Works fine 
		 *  Production - Don't Accept
		 * 
		 */
		
		
		ChromeOptions opt = new ChromeOptions();
		opt.setAcceptInsecureCerts(true);
		opt.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.cacert.org/");
		

	}

}
