package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Selenium");
		
		Thread.sleep(3000);
		
		List<WebElement> element = driver.findElements(By.xpath("//*[@role='listbox']/li"));
		
		for (WebElement ele : element) 
		{
			System.out.println(ele.getText());
			if(ele.getText().equalsIgnoreCase("Selenium python"))
			{
				ele.click();
				break;
			}
		}
		
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
