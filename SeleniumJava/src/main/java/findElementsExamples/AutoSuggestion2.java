package findElementsExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Selenium");
		Thread.sleep(3000);
		
		List<WebElement> allSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		for (WebElement ele : allSuggestions) 
		{
			if(ele.getText().contains("python"))
			{
				ele.click();
				break;
			}
			
		}
		
		
		
		}
		
	}
		

	


