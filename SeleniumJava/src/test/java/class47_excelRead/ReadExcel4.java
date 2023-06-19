package class47_excelRead;

import java.io.File;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel4 
{
	
	/*
	 *  Blank cell will be treated as null
	 *  You have to read specific cell with specific method
	 * 
	 */

	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		//Load Excel
		XSSFWorkbook wb=new XSSFWorkbook(new File("./TestData/Data.xlsx"));
		
		
		//get Speicified type of data
		double value=wb.getSheet("User").getRow(0).getCell(3).getNumericCellValue();
		
		
		System.out.println(value);

		
		//get Speicified type of data
		boolean status=wb.getSheet("Login").getRow(0).getCell(2).getBooleanCellValue();
			
		System.out.println(status);
		
		//Close Workbook
		wb.close();
		

	}

}
