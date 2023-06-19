package getStarted;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTestChrome {

	public static void main(String[] args) throws InterruptedException{
		
		//If we are using 4.6.0 and above - SeleniumManager take cares of drivers Internally
		//Any Version before 4.6.0 then Selenium will use WebDriverManager or use drivers manually from Vendors(Chrome-Chromedriver, firefox-GikoDriver)
		
		//To Launch the Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		
		//Navigate to a Website
		driver.get("https://courses.learn-automation.com/");
		
		//Maximize Current Window
		driver.manage().window().maximize();
		
		//Delay Execution 5 seconds to view the maximize window
		Thread.sleep(5000);
		
		//To get the Title of the Website and print
		String title = driver.getTitle();
		System.out.println("Title of the application is: " + title.toUpperCase());
		
		//To get the Current URL loaded in browser
		String url = driver.getCurrentUrl();
		System.out.println("Current URL is " + url);
		
		//To Close the browser
		driver.quit();

	}

}
