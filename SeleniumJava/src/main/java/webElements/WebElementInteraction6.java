package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementInteraction6 {

	
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://freelance-learn-automation.vercel.app/signup");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		WebElement state = driver.findElement(By.name("state"));
		Select stateDD = new Select(state);
		
		//We are selecting based on index
		stateDD.selectByIndex(6);
		System.out.println("Current State is "+stateDD.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		
		//select
		stateDD.selectByValue("Kerala");
		System.out.println("Current State is "+stateDD.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		
		// select based on text on UI
		stateDD.selectByVisibleText("Karnataka");
		Thread.sleep(2000);
		
		System.out.println("Current State is "+stateDD.getFirstSelectedOption().getText());
		
		
		
		/*
		 * 	 index - last
		 * 	 value - 2nd 
		 * 	 visibleText - 1st 
		 *    
		 * 
		 */
		
		
	}

}
