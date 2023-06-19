package findElements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementInteraction9 {

	
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://freelance-learn-automation.vercel.app/signup");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		WebElement state = driver.findElement(By.xpath("//select[@id='state']"));
		
		Select stateDD = new Select(state);
		
		List<WebElement> allValuesInDropDown=stateDD.getOptions();
		
		int count = allValuesInDropDown.size();
		
		System.out.println("The Total count is "+count);
		
		for(int i=0;i<count;i++)
		{
			WebElement ele=allValuesInDropDown.get(i);
			String StateName = ele.getText();
			System.out.println("State Names are : "+StateName);
			
			if(StateName.equalsIgnoreCase("Manipur"))
			{
				System.out.println("State Manipur FOund");
				break;
			}
		}
		
		
		
		
		
	}

}
