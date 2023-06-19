package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import helper.Utility;

public class DragDropScenario3 {

	public static void main(String[] args) {
		
		
		WebDriver driver= Utility.startBrowser("Chrome", "https://jqueryui.com/draggable/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		WebElement src=driver.findElement(By.id("draggable"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDropBy(src, 200, 100).perform();
		
		

	}

}