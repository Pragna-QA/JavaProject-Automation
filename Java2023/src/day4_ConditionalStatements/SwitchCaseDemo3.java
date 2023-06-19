package day4_ConditionalStatements;

public class SwitchCaseDemo3 {

	public static void main(String[] args) {
		
		String fruit ="Jack";
		
		switch (fruit)
		{
		case "Orange":
			System.out.println("This is Orange");
			break;
		case "Apple":
			System.out.println("This is Apple");
			break;
		case "Mango":
			System.out.println("This is Mango");
			break;

		default:
			System.out.println("Sorry we don't have this fruit in Stock");
			//break;
		}

}

}