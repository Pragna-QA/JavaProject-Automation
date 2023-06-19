package findElements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementInteraction11 {

	
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://freelance-learn-automation.vercel.app/signup");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement hobbies = driver.findElement(By.id("hobbies"));
		
		Select hobbiesDD = new Select(hobbies);
		
		hobbiesDD.selectByIndex(3);
		hobbiesDD.selectByValue("Dancing");
		hobbiesDD.selectByVisibleText("Playing");
		
		Thread.sleep(2000);
		
		//Works only with Multi Select Dropdown
		List<WebElement> allSelectedhobbies=hobbiesDD.getAllSelectedOptions();
		System.out.println(allSelectedhobbies.size());
		
		
		
		
		
		
	}

}
