package class47_excelRead;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		/*
		 * 		Names Of Lib For Different Type	
		 * 
		 *  Apache POI - Excel
		 *  CSV  - opencsv Jar
		 *  JSON - json-simple (For Reading)
		 *  XML  - Simple Java Classes
		 *  etc
		 * 
		 */
		
		
		/*  for .xlsx
		 * 	XSSFWorkbook - Help to load the workbook
		 *  XSSFSheet - Help to load a sheet
		 *  XSSFRow - Help to load specific row
		 *  XSSFCell - load a cell
		 *  
		 */
		
		/*  If you are using older version of excel ie .xls
		 * 	HSSFWorkbook - Help to load the workbook
		 *  HSSFSheet - Help to load a sheet
		 *  HSSFRow - Help to load specific row
		 *  HSSFCell - load a cell
		 *  
		 */
		
		
		// Step 1 - load the excel
		
		File src = new File("./TestData/Data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(src);
		int totalSheetInExcel = wb.getNumberOfSheets();
		System.out.println("Sheet Count: "+ totalSheetInExcel);		
		wb.close();
		

	}

}
