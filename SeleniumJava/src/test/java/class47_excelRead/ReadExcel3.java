package class47_excelRead;

import java.io.File;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel3 {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		
		XSSFWorkbook wb=new XSSFWorkbook(new File("./TestData/Data.xlsx"));

		String value=wb.getSheet("Login").getRow(2).getCell(0).getStringCellValue();
			
		System.out.println(value);
		
		
		System.out.println("Value from Another Sheet : "+ wb.getSheet("User").getRow(2).getCell(2).getStringCellValue());
		
		wb.close();
		

	}

}
