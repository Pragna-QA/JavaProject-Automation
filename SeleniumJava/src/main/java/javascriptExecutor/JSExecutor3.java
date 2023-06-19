package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.Utility;

public class JSExecutor3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=Utility.startBrowser("Chrome", "http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement ele=driver.findElement(By.id("pass"));
		
		//ele.sendKeys("admin@email.com");
		
		js.executeScript("arguments[0].value=arguments[1]",ele,"pragna@gmail.com");
		
		js.executeScript("arguments[0].click()",ele);
		

	}

}
