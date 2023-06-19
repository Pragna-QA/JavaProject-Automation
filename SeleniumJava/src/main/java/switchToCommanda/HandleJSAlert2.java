package switchToCommanda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.Utility;

public class HandleJSAlert2 {

	public static void main(String[] args) {
		
		
		WebDriver driver =	Utility.startBrowser("Chrome", "https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.findElement(By.name("login")).sendKeys("saipragna.bheema@gmail.com");

	}

}
