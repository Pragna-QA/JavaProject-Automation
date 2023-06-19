package switchToCommanda;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.Utility;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {
		
		
    WebDriver driver = Utility.startBrowser("Chrome", "https://www.redbus.in/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    driver.findElement(By.xpath("//i[@id='i-icon-profile']")).click();
    driver.findElement(By.id("signInLink")).click();
    Thread.sleep(2000);
    driver.findElements(By.tagName("iframe")).size();
    
    //Index is not preferred   
   // driver.switchTo().frame(0);
    
    //name or id is preffered if available
   // driver.switchTo().frame("name or id");
    
    
    WebElement applicationFrame=driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
    
    driver.switchTo().frame(applicationFrame);
    
    driver.findElement(By.id("mobileNoInp")).sendKeys("9160142137");
    
    //Switch to main frame/Window
    driver.switchTo().defaultContent();

	}

}
