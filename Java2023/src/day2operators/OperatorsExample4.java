package day2operators;

public class OperatorsExample4 {

	public static void main(String[] args) {


		int x=25;
		int y=10;
		
		int largest;
		
		//(x>y ? x:y) ? z:((x>y) ? x:y); 
		
		//ans = (conditional expression) ? execute if true : execute if false
		
		largest  = (25>10) ? 25:10 ;
		
		
		System.out.println("The Largest Number is :" +largest);
	}

}
