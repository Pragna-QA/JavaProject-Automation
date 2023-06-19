package switchToCommanda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import helper.Utility;

public class HandleJSAlert4 {

	public static void main(String[] args) {
		
		
	WebDriver driver =	Utility.startBrowser("Chrome", "https://seleniumpractise.blogspot.com/2019/01");
	
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	
	Utility.waitForAlert(driver).accept();
	
	//new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
	
	
	//Accept Alert
	
	driver.switchTo().alert().accept();
	
	
	
	//Dismiss the Alert
	
	driver.switchTo().alert().dismiss();
	
	
	
	//Capture the text of the alert
	
	driver.switchTo().alert().getText();
	
	
	//Can enter the text in alert
	driver.switchTo().alert().sendKeys("");
	
	
	

	}

}
