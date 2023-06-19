package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import helper.Utility;

public class KeyboardEvents {

	public static void main(String[] args) {
		
		WebDriver driver = Utility.startBrowser("Chrome", "https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//a[normalize-space()='Create new account'])[1]")).click();
		
		Actions act = new Actions(driver);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Selenium");
		
		
		//act.sendKeys(Keys.TAB).pause(Duration.ofSeconds(20)).sendKeys("WebDriver");
		
		act.sendKeys(Keys.TAB).pause(Duration.ofSeconds(5)).sendKeys("WebDriver");
		
		

	}

}
