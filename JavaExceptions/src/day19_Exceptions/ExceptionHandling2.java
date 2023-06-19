package day19_Exceptions;



import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		Scanner sc=new Scanner(System.in);
	
		try 
		{
			System.out.println("Please enter first number");
			
			int a=sc.nextInt();
			
			System.out.println("Please enter second number");
			
			int b = sc.nextInt();
			
			int result=a/b;
			System.out.println("Result is " +result);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Please do not provide number as zero" +e.getMessage());
			
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please enter only number as integer");
		}
		
		System.out.println("End");
		
	}

}