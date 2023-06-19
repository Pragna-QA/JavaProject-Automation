package day19_Exceptions;

import java.util.Scanner;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		System.out.println("START");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the First Number: ");
		int n1 = sc.nextInt();
		
		System.out.println("Please Enter the Second Number: ");
		
		
		int n2=0;
		try {
			n2 = sc.nextInt();
		} catch (Exception e1) {
			System.out.println("Please Enter only Integer numbers as of now");
//			e1.printStackTrace();
		}
		
		try 
		{
			int result = n1/n2;
			System.out.println("The Result is: "+result);
			
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("Please don't provide the number as ZERO");	
		}
		
		
		
		System.out.println("END");
		
		
	}
	

}
