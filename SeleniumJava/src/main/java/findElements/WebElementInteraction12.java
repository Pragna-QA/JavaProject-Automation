package findElements;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebElementInteraction12 {

	
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://freelance-learn-automation.vercel.app/signup");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//driver.findElement(By.id("Pragna"));
		driver.findElements(By.id("Pragna"));
		
	}

}
