package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.Utility;

public class JSExecutorElementHighlight2 {

	
		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver=Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");

			Utility.highlightWebElement(driver, By.id("email1")).sendKeys("pragna@gmail.com");
			Utility.highlightWebElement(driver, By.id("password1")).sendKeys("Daddy@123");
			Utility.highlightWebElement(driver, By.xpath("//button[@type='submit']")).click();
			}

		}