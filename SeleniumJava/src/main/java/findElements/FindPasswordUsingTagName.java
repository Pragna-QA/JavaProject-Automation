package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindPasswordUsingTagName {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://freelance-learn-automation.vercel.app/signup");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElements(By.tagName("input")).size();
		driver.findElements(By.tagName("input")).get(2).sendKeys("Daddy@1990");

	}

}
