package waitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

import helper.Utility;

public class FluentWaitExample {
	
	// PageLoad 300 Script 30 ImplitWait 0

	public static void main(String[] args) {
		
		WebDriver driver=Utility.startBrowser("Chrome", "http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
	
		 // Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(Duration.ofSeconds(30))
		       .pollingEvery(Duration.ofMillis(200))
		       .ignoring(NotFoundException.class);

		   WebElement element= wait.until(new Function<WebDriver, WebElement>() 
		   {
		     public WebElement apply(WebDriver driver) 
		     {
		       
		    	 WebElement element=driver.findElement(By.xpath("//p[@id='demo']"));
		    	 
		    	 String text=element.getText();
		    	 
		    	 System.out.println("Current text is "+text);
		    	 
		    	 if(text.equalsIgnoreCase("WebDriver"))
		    	 {
		    		 return element;
		    	 }
		    	 else {
		    		 return null;
		    	 }
		    	 
		     }
		   });
		   
		   if(element.isDisplayed())
		   {
			   System.out.println("Found !!!");
		   }
		   else
		   {
			   System.out.println("Not Found !!!");
		   }
		   

		
		driver.quit();

	}

}
