package day19_Exceptions;

import java.util.Scanner;

public class ExceptionHandling7 {

	public static void main(String[] args) {
		
		System.out.println("START");
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Please Enter the First Number");
			int n1 = sc.nextInt();
			
			
			
			System.out.println("Please Enter the Second Number");
			int n2 = sc.nextInt();
			
			int result = n1/n2;
			System.out.println("The Result is " +result);
			
		} 
		
		catch (ArithmeticException e) 
		{
			System.out.println("Please don't provide the number as ZERO "+e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Something Went Wrong, Please try again later!! " +e.getMessage());
		}
		catch(Throwable e)
		{
			System.out.println("Something went wrong please try again later " +e.getMessage());
		}
		
		
		//finally - block which will always execute - Good to use
		finally 
		{
			sc.close();
			System.out.println("Connection closed");
		}
		
		System.out.println("END");

	}

}