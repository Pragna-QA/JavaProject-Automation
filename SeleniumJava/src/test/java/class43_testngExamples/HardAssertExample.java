package class43_testngExamples;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertExample 
{
	
	
	@Test
	public void test1()
	{
		System.out.println("Start");
		String expexted="Pragna";
		String actual ="Pragnaa";
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actual, expexted);
		softAssert.assertFalse(true);
		softAssert.assertNull(null);
		System.out.println("End");
		softAssert.assertAll();	
	}
	
	@Test
	public void test2()
	{
		SoftAssert softAssert = new SoftAssert();
		
		String course = "Selenium";
		
		if (course.equalsIgnoreCase("Java")) 
		{
			Assert.fail();
			
		}
		
		softAssert.assertAll();
	}

}
