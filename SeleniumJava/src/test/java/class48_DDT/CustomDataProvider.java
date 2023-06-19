package class48_DDT;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import dataProvider.ExcelReader;

public class CustomDataProvider {

	/*
	 *  This class will maintain all data providers which will be used in current project
	 * 
	 */
	
	
	@DataProvider(name="loginData")
	public static Object[][] getData()
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
	
	
	@DataProvider(name="loginDataForApplication")
	public static Object[][] getDataForApp()
	{
		System.out.println("Test data getting generated");
		
		Object[][]arr=new Object[3][2];
		arr[0][0]="pragna@email.com";
		arr[0][1]="Daddy@123";
		
		arr[1][0]="rajesh@email.com";
		arr[1][1]="rajesh@123";
		
		arr[2][0]="pragnasai@email.com";
		arr[2][1]="Daddy@123";
		
		System.out.println("Test data generated");
		
		return arr;
	}
	
	
	@DataProvider(name="loginDataFromExcel")
	public static Object[][] getDataForAppFromExcel() throws InvalidFormatException, IOException
	{
		System.out.println("Test data getting generated");
	
		XSSFWorkbook wb=new XSSFWorkbook(new File("./TestData/Data.xlsx"));
		
		int row=wb.getSheet("Users").getPhysicalNumberOfRows();
		
		int column=wb.getSheet("Users").getRow(0).getPhysicalNumberOfCells();
		
		
		Object[][]arr=new Object[row][column];
		
		//3 times
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
						arr[i][j]=wb.getSheet("Users").getRow(i).getCell(j).getStringCellValue();
			}
			
		}
		
		System.out.println("Test data generated");
		
		return arr;
	}
	
	
	@DataProvider(name="loginDataFromExcelFile")
	public static Object[][] getDataForAppFromExcelUtility() 
	{
		Object[][]arr=ExcelReader.getDataFromSheet("Users");
		return arr;
		
	}
	
	
	@DataProvider(name="accountsData")
	public static Object[][] getAccountsData() 
	{
		Object[][]arr=ExcelReader.getDataFromSheet("Login");
		return arr;
		
	}

	
}
