package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.Utility;

public class JSExecutor2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement ele=driver.findElement(By.id("email1"));
		js.executeScript("arguments[0].value=arguments[1]",ele,"pragna@gmail.com");
		

	}

}
