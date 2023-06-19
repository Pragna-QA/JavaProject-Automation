package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import helper.Utility;

public class JSExecutorElementHighlight {

	
		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver=Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");

			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			js.executeScript("arguments[0].setAttribute('style','background: yellow; border: solid 2px red')",driver.findElement(By.id("email1")));
			
			Thread.sleep(1000);
			
			js.executeScript("arguments[0].setAttribute('style','border: solid 2px orange')",driver.findElement(By.id("email1")));
			

			js.executeScript("arguments[0].setAttribute('style','background: yellow; border: solid 2px red')",driver.findElement(By.id("password1")));
			
			Thread.sleep(1000);
			
			js.executeScript("arguments[0].setAttribute('style','border: solid 2px orange')",driver.findElement(By.id("password1")));


			}

		}