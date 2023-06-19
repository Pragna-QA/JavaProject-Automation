package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import helper.Utility;

public class ActionMethods {

	public static void main(String[] args) {
		
		
		WebDriver driver = Utility.startBrowser("Chrome", "https://jqueryui.com/draggable/");
		WebElement src=driver.findElement(By.id("draggable"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(src).perform();
		
		act.contextClick(src).perform();
		
		act.keyDown(Keys.ENTER).perform();
		
		act.keyUp(Keys.ENTER).perform();
		
		act.scrollToElement(src).perform();
		

	}

}
