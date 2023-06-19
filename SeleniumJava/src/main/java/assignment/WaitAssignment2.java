package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Utility;

public class WaitAssignment2 {

	public static void main(String[] args) {
		
		
		WebDriver driver=Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
		driver.findElement(By.xpath("//a[normalize-space()='New user? Signup']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.textToBePresentInElement(By.xpath("//button[normalize-space()='Sign up']")));
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//button[normalize-space()='Sign up']"), "sign up"));
		//driver.quit();

	}

}
