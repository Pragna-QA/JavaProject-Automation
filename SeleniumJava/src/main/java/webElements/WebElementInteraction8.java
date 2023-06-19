package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementInteraction8 {

	
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://freelance-learn-automation.vercel.app/signup");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement hobbies = driver.findElement(By.id("hobbies"));
		
		Select hobbiesDD = new Select(hobbies);
		
		hobbiesDD.selectByVisibleText("Reading");
		hobbiesDD.selectByIndex(4);
		//Thread.sleep(2000);
		
		hobbiesDD.selectByValue("Playing");
		//Thread.sleep(2000);
		
		
		Thread.sleep(2000);
		
		// this will deselect all selected values
				//hobbiesDD.deselectAll();
		
		//System.out.println("The Selected Hobbies are: " + hobbiesDD);
		hobbiesDD.deselectAll();
		
		
		
		
		
		
	}

}
