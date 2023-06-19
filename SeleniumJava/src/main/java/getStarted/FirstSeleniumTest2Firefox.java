package getStarted;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest2Firefox {

	public static void main(String[] args) {
		
		//If we are using 4.6.0 and above - SeleniumManager take cares of drivers Internally
		//Any Version before 4.6.0 then Selenium will use WebDriverManager or use drivers manually from Vendors(Chrome-Chromedriver, firefox-GikoDriver)
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://courses.learn-automation.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Title of the application is: " + title.toUpperCase());
		String url = driver.getCurrentUrl();
		System.out.println("Current URL is " + url);
		driver.quit();

	}

}
