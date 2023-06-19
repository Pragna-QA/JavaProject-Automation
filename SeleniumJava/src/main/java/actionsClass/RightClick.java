package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import helper.Utility;

public class RightClick {

	public static void main(String[] args) {


		WebDriver driver = Utility.startBrowser("Chrome", "https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions act = new Actions(driver);
		
		act.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).perform();
		
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();		

	}

}
