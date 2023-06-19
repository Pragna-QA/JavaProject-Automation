package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import helper.Utility;

public class DragDropScenario2 {

	public static void main(String[] args) {
		
		
		WebDriver driver= Utility.startBrowser("Chrome", "https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		WebElement src=driver.findElement(By.id("draggable"));
		
		WebElement dest=driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		
		act.clickAndHold(src)
		.pause(Duration.ofSeconds(1))
		.moveToElement(dest)
		.pause(Duration.ofSeconds(2))
		.release()
		.build()
		.perform();
		
		

	}

}