package waitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Utility;

public class WebDriverWaitExample {
	
	// PageLoad 300 Script 30 ImplitWait 0

	public static void main(String[] args) {
		
		WebDriver driver=Utility.startBrowser("Chrome", "http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(100));
		
		Alert alt=wait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println("Alert text is "+alt.getText());
		
		if(alt.getText().contains("Selenium"))
		{
			alt.accept();
		}
		
		driver.quit();

	}

}