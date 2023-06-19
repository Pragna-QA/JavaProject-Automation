package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.Utility;

public class JSExecutor4_scrollPage {

	public static void main(String[] args) {
		
		WebDriver driver=Utility.startBrowser("Chrome", "https://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");

		//page level scrolling
		//driver.findElement(By.linkText("Project on Github")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//document.getElementsByTagName("textarea")[0].scrollIntoView(true)
		
		WebElement ele=driver.findElement(By.xpath("//textarea"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", ele);

		ele.clear();
		
		ele.sendKeys("selenium");
		
		
		}

	}