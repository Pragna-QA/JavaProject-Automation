package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementInteraction {

	
		public static void main(String[] args) throws InterruptedException {
			

			WebDriver driver=new ChromeDriver();
			
			driver.get("https://freelance-learn-automation.vercel.app/login");
			
			/* 
			 * By user=By.id("email1");
			
			 driver.findElement(user);
			 
			*/
			
			 WebElement username=driver.findElement(By.id("email1"));
			
			 username.sendKeys("admin@email.com");
			 
			 //admin@123
			 
			 Thread.sleep(2000);
			 
			 // checkbox, button, radio etc
			 username.click();
			 
			 username.clear();
			 
			 username.sendKeys("mukesh@gmail.com");
			 
			 System.out.println("Display status "+username.isDisplayed());
			 
			 System.out.println("Enabled Status "+username.isEnabled());
			 
			 System.out.println("Selected Status "+ username.isSelected());
			 
			 System.out.println("Place holder "+username.getAttribute("placeholder"));
			 
			 System.out.println("Some Other Attribute "+username.getAttribute("mukesh"));
			 
			 System.out.println("CSS Value is "+username.getCssValue("border"));
			 
			 System.out.println("Another CSS Value is "+username.getCssValue("otwani"));
			 
			 driver.close();
			
			 
			
		}

	}