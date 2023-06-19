package assignment;


import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentStateSelection {

	
	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://freelance-learn-automation.vercel.app/signup");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement state=driver.findElement(By.id("state"));
		
		Select stateDD = new Select(state);
		List<WebElement> allValuesInDropDown=stateDD.getOptions();
		
		System.out.println("The Total count is "+allValuesInDropDown.size());
		
		for (WebElement ele : allValuesInDropDown) 
		{
			String sname1=ele.getText();
			
			ArrayList<String> sname = new ArrayList<String>();
			sname.add(sname1);
			System.out.println("The State Names are: "+sname);
			//System.out.println(sname.get(3));
			//Thread.sleep(1000);
			//driver.close();
		}
		

	}

}
