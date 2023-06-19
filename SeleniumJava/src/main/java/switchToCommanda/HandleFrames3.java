package switchToCommanda;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import helper.Utility;

public class HandleFrames3 {

	public static void main(String[] args) throws InterruptedException {
		
		
    WebDriver driver = Utility.startBrowser("Chrome", "https://www.redbus.in/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(By.xpath("//i[@id='i-icon-profile']")).click();
    driver.findElement(By.id("signInLink")).click();
    Thread.sleep(2000);
    driver.findElements(By.tagName("iframe")).size();
    
    //name or ID
    driver.switchTo().frame("Sai");
    
    driver.findElement(By.id("mobileNoInp")).sendKeys("9160142137");
    
    //Switch to main frame/Window
    driver.switchTo().defaultContent();

	}

}
