package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementInteraction5 {

	
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://freelance-learn-automation.vercel.app/signup");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement state = driver.findElement(By.name("state"));
		Select stateDD = new Select(state);
		
		//We are selecting based on index
		stateDD.selectByIndex(6);
		Thread.sleep(2000);
		
		stateDD.selectByValue("Kerala");
		Thread.sleep(2000);
		
		// select based on text on UI
		stateDD.selectByVisibleText("Karnataka");
		Thread.sleep(2000);
		
		String stateName=stateDD.getFirstSelectedOption().getText();
		
		System.out.println("Current state is "+stateName);
		
		
		if(stateName.equalsIgnoreCase("karnataka"))
		{
			System.out.println("Passed - The State Value selected properly");
		}
		else
		{
			System.out.println("Failed - The State Value didn't selected properly");
		}
		
		
		/*
		 * 	 index - last
		 * 	 value - 2nd 
		 * 	 visibleText - 1st 
		 *    
		 * 
		 */
		
		
	}

}
