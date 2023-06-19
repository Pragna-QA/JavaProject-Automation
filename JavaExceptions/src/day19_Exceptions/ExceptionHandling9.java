package day19_Exceptions;

public class ExceptionHandling9 {

	public static void main(String[] args) 
	{
		
		System.out.println("START");
		try 
		{
			Thread.sleep(-5000);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("END");

	}

}
