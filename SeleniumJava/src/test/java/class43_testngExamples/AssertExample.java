package class43_testngExamples;

import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertExample 
{
	
	/*
	 * Assert :- 
	 * Hard Assert - Class - If Assert fails then the script fails in the next line itself.
	 * Soft Assert - Class - If Assert fails then it will continue till last line but it fails at the end.
	 * Selenium IDE :-
	 * 				Assert
	 * 				Verify
	 */
		
	@Test
	public void test1()
	{
		//Comparing String to String
		String actual = "Sai Pragna";
		String expected = "Sai Pragna ";
		Assert.assertEquals(actual, expected);
				
	}
	
	@Test
	public void test2()
	{
		//Comparing String to String and print the message if something wrong
		String actual = "Rajesh Guttikonda";
		String expected = "Rajesh Guttikonda";
		Assert.assertEquals(actual, expected, "Name doesn't Match");	
	}
	
	@Test
	public void test3()
	{
		String actual = "Selenium is for Web Automation";
		//Partial Match - Way1
		Assert.assertEquals(actual.contains("Web"), true, "Msg doesn't contains Web");
	}
	
	@Test
	public void test4()
	{
		String actual = "Selenium is for Web Automation";
		//Partial Match - Way2
		Assert.assertTrue(actual.contains("automation"), "Selenium is not found");
	}
	

	@Test
	public void test5()
	{
		//Comparing two Integers
		int actual =10;
		int expected =10;
		Assert.assertEquals(10, 10);
		Assert.assertTrue(actual==expected);
	}
	
	
	@Test
	public void test6()
	{
		List<String> actual = Arrays.asList("Selenium","Python","Java","WebDriver");
		List<String> expected = Arrays.asList("Selenium","Python","Java","WebDriver");
		Assert.assertEquals(actual, expected);		
	}
	
	
	@Test
	public void test7()
	{
		System.out.println("Start");
		List<String> actual = Arrays.asList("Selenium","Python","Java","WebDriver");
		List<String> expected = Arrays.asList("Selenium","Python","Java",""); //If it fails, it won't go to end
		Assert.assertEquals(actual, expected);
		System.out.println("End");
	}

}
