package class48_DDT;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDTExample 
{	
		/*
		 * 	Make sure data provider name is correct
		 *  Make sure number of argument should match with number of columns in data provider
		 */
		
		
		@Test(dataProvider = "loginData")
		public void test1(String args1,String arg2, String arg3)
		{
			System.out.println("Data From First Column : " +args1);
			System.out.println("Data From Second Column : " +arg2);
			System.out.println("Data From Third Column : " +arg3);
			System.out.println("******************");
		}
		
		@DataProvider(name="loginData")
		public Object[][] getData()
		{
			System.out.println("Test data getting generated");
			
			Object[][]arr=new Object[3][3];
			arr[0][0]="Selenium";
			arr[0][1]="Grid";
			arr[0][2]="Python";
			
			arr[1][0]="Maven";
			arr[1][1]="Gradle";
			arr[1][2]="Java";
			
			arr[2][0] ="Python";
			arr[2][1]="Cucumber";
			arr[2][2]="GitHub";
			
			System.out.println("Test data generated");
			
			return arr;
		}
		
}
	