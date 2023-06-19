package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementInteraction4 {

	
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.linkText("New user? Signup")).click();
		driver.findElement(By.partialLinkText("Signup")).click();
		driver.findElement(By.linkText("New user?")).click();
		
	}

}
