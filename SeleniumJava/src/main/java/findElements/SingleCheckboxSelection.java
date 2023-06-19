package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleCheckboxSelection {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/signup");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List<WebElement> allCheckboxes = driver.findElements(By.className("interest"));
		
		WebElement SingleCheckbox = allCheckboxes.get(2);
		SingleCheckbox.click();
		
		//Click on last Checkbox
		WebElement SingleCheckbox1 = allCheckboxes.get(allCheckboxes.size()-1);
		SingleCheckbox1.click();
		

	}

}
