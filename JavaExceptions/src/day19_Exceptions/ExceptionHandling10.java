package day19_Exceptions;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling10 {

	public static void main(String[] args) throws AWTException, FileNotFoundException 
	{
		
		Robot r = new Robot();
		FileInputStream fis = new FileInputStream("/home");
		
		
	}

}
