package class45_cross_parallelExecution;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBT 
{

	/*
	 * Execute Single test across multiple browser is known as "Cross Browser Testing"
	 * 
	 * Selenium, TestNG
	 * Jenkins, TeamCity
	 * Grid, Docker
	 * The data we are taking from XML file, is known as "Parameterised in TestNG"
	 */
	
	@Parameters({"fname","lname"})
	@Test
	public void test1(@Optional("Selenium") String fname,@Optional("Python") String lname)
	{
		System.out.println(fname);
		System.out.println(lname);
	}
	
}
