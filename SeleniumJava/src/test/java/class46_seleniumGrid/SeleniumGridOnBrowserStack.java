package class46_seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridOnBrowserStack 
{

	/*
	 * HUB URL - 
	 * DesiredCapabilities -
	 * 
	 */
	
	
	public static void main(String[] args) throws MalformedURLException
	{
		String hubURL = "https://saipragnabheema_zsXjwD:LGR3fJwVspozECpM9FP2@hub.browserstack.com/wd/hub";
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("os", "Windows");
		map.put("osVersion", "11");	
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("browserName", "Chrome");
		cap.setCapability("browserVersion", "latest");
		cap.setCapability("bstack:options", map);
		
		 
		WebDriver driver = new RemoteWebDriver(new URL(hubURL), cap);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Title is :"+driver.getTitle());
		driver.quit();
		
	}
}
