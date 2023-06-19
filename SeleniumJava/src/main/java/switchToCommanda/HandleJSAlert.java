package switchToCommanda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.Utility;

public class HandleJSAlert {

	public static void main(String[] args) {
		
		
	WebDriver driver =	Utility.startBrowser("Chrome", "https://mail.rediff.com/cgi-bin/login.cgi");
	
	driver.findElement(By.name("proceed")).click();
	
	driver.findElement(By.name("login")).sendKeys("saipragna.bheema@gmail.com");

	}

}
