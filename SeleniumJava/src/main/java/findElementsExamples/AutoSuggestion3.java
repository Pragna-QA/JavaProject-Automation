package findElementsExamples;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Selenium");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@role='presentation']//b[contains(text(), \"python\")]")).click();
		
		}
		
	}
		

	


