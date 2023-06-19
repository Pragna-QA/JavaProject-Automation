package day19_Exceptions;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandling11 {

	public static void main(String[] args) throws AWTException, FileNotFoundException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your Age: ");
		int age = sc.nextInt();
		
		if(age<21)
		{
			throw new ArithmeticException("Please Focus on Studies");
		}
		else
		{
			System.out.println("You are Eligible");
		}
		
		
	}

}
