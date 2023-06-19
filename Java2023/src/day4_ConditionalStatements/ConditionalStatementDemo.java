package day4_ConditionalStatements;

public class ConditionalStatementDemo {

	public static void main(String[] args) {
		
		System.out.println("Start");
		int count = 12 ;
		if (count<10)
		{
			System.out.println("Count is less");
		}
		else
		{
			System.out.println("Count is  good");
		}
		
		if (count>10)
		{
			System.out.println("Good to Start the Session");
		}
		else
		{
			System.out.println("Will start the session from tomorrow");
		}
		
		if (count==12)
		{
			System.out.println("Count looks good");
		}
		else
		{
			System.out.println("Exit");
		}
		
		
		System.out.println("End of the Session");

	}

}
