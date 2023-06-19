package day19_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling5 {

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
		catch (InputMismatchException e) 
		{
			
			System.out.println("Please Enter only Integer Numbers");		
		}
		catch (ArithmeticException e) 
		{
			System.out.println("Please don't provide the number as ZERO");
		}
		catch (Exception e) {
			System.out.println("Something Went Wrong, Please try again later!!");
		}
		catch(Throwable e)
		{
			System.out.println("Something went wrong please try again later");
		}
		
		
		sc.close();
		
		System.out.println("END");

	}

}