package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import helper.Utility;

public class DoubleClick {

	public static void main(String[] args) {
		
		
		WebDriver driver = Utility.startBrowser("Chrome", "https://api.jquery.com/dblclick/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe)[1]")));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(driver.findElement(By.xpath("//span[text()='Double click the block']//parent::body/div"))).perform();
		
		

	}

}
