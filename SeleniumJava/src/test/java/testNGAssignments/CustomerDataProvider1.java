package testNGAssignments;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class CustomerDataProvider1 

{
	@DataProvider(name="loginDataFromExcel")
	public static Object[][] getgetDataFromExcel() throws InvalidFormatException, IOException

	{
		System.out.println("Test data getting generated");
		XSSFWorkbook wb = new XSSFWorkbook(new File("./TestData/Data.xlsx"));
		int rows=wb.getSheet("Signup").getPhysicalNumberOfRows();
		int columns = wb.getSheet("Signup").getRow(0).getPhysicalNumberOfCells();
		Object arr[][]=new Object[rows][columns];	
		
		for (int i = 0; i < rows; i++) 
		{
			for(int j=0; j<columns; j++)
			{
				arr[i][j]=wb.getSheet("Signup").getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		
		System.out.println("Test data generated");
		return arr;
	}
}
