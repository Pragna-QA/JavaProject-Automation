package class48_DDT;

import org.testng.annotations.Test;

public class DDTExample2 
{	
		/*
		 * 	Make sure data provider name is correct
		 *  Make sure number of argument should match with number of columns in data provider
		 */
		
		
	@Test(dataProvider = "loginData",dataProviderClass = CustomDataProvider.class)
	public void test1(String args1,String arg2, String arg3)
	{
		System.out.println("Data From First Column : " +args1);
		System.out.println("Data From Second Column : " +arg2);
		System.out.println("Data From Third Column : " +arg3);
		System.out.println("******************");
	}
				
}
	