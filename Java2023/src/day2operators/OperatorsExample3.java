package day2operators;

public class OperatorsExample3 {

	public static void main(String[] args) {


		int x=5;
		int y=10;
		int z= 3;
		int largest;
		
		//z>(x>y ? x:y) ? z:((x>y) ? x:y); 
		
		//ans = (conditional expression) ? execute if true : execute if false
		
		largest  = 3>(5>10 ? 5:10) ? 3: ((5>10) ? 5:10);
		
		
		System.out.println("The Largest Number is :" +largest);
	}

}
