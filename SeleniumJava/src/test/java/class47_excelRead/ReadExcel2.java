package class47_excelRead;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		
		// Step 1 - load the excel	
		File src = new File("./TestData/Data.xlsx");
		
		// load excel
		XSSFWorkbook wb=new XSSFWorkbook(src);
		
		
		
		// load sheet
		XSSFSheet sh1=wb.getSheet("Login");
		
		
		// load row
		XSSFRow r1 = sh1.getRow(2);
		
		
		// load cell/column
		XSSFCell c1=r1.getCell(1);
			
				
		// get specific type of data
		String value=c1.getStringCellValue();
			
		System.out.println(value);
				
		// close workbook		
		wb.close();
		

	}

}
