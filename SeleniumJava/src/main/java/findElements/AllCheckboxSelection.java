package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllCheckboxSelection {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/signup");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List<WebElement> allCheckboxes = driver.findElements(By.className("interest"));
		
		for (WebElement ele : allCheckboxes) 
		{
			ele.click();
		}


	}

}
