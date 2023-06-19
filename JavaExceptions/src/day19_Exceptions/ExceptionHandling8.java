package day19_Exceptions;

public class ExceptionHandling8 {

	public static void main(String[] args) 
	{
		
		System.out.println("START");
		try 
		{
			Thread.sleep(-5000);
		} 
		catch (InterruptedException e) 
		{
			System.out.println(e.getMessage());
		}
		catch (IllegalArgumentException e) 
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("END");

	}

}
