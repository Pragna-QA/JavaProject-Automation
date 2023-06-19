package javascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import helper.Utility;

public class JSExecutor1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('Pragna')");
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		js.executeScript("document.getElementById('email1').value='pragna@gmail.com'");
		js.executeScript("document.getElementById('password1').value='Daddy@123'");

	}

}
