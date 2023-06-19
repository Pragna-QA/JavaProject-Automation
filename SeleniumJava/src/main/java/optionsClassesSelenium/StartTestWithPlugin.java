package optionsClassesSelenium;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StartTestWithPlugin {

	public static void main(String[] args) {
		
		// 1- https://chrome.google.com/webstore/detail/get-crx/dijpllakibenlejkbajahncialkbdkjc
		
		ChromeOptions opt = new ChromeOptions();
		opt.addExtensions((new File("./extensions/SelectorsHub 4.7.2.0.crx")));
		WebDriver driver = new ChromeDriver(opt);
		driver.get("http://www.google.com");

	}

}
