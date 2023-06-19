package optionsClassesSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessMode {

	public static void main(String[] args) {
		
		
		/*
		 * Headless Mode - Background
		 * Headed Mode - GUI Mode - Normal Execution
		 * 
		 */
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--headless=new");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://freelance-learn-automation.vercel.app/login");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		

	}

}
