package findElementsExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Selenium");
		Thread.sleep(3000);
		
		List<WebElement> allSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		System.out.println("Number of Suggestions:  " +allSuggestions.size());
		
		int count = allSuggestions.size();
		
		for (int i=0;i<count;i++)
		{
			WebElement ele=allSuggestions.get(i);
			String value=ele.getText();
			System.out.println("Counter is " + i +" Value is : " + value);
			
			if (value.contains("python")) 
			{
				ele.click();
				break;
				
			}
		}
		
	}
		

	}


