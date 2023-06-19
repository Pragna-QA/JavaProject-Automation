package day11_Arrays_Inheritance;

public class IDFCBank extends RBI {

	public static void main(String[] args) {
		
		// 1 - Reference of child class and object of child class
		IDFCBank Customer1 = new IDFCBank();
		Customer1.deposit();
		Customer1.withdraw();
		Customer1.kyc();
		Customer1.eduLoan();
		Customer1.goldLoan();
		
		
		// 2 - Reference of Base class and object of Base class - This will allow to access all the methods of base class only
		RBI Customer2 = new RBI();
		Customer2.deposit();
		Customer2.withdraw();
		Customer2.kyc();
		
		// 3 - Reference of Base class and object of Child class - You can only access base class methods and variables
		RBI Customer3 = new IDFCBank();
		Customer3.deposit();
		Customer3.withdraw();
		Customer3.kyc();
		
		// 4 - not allowed
		//IDFCBank customer4=new RBI();
		
		
		
				
		

	}
	
	public void goldLoan()
	{
		System.out.println("Customer can available for Gold Loan");
	}
	
	public void eduLoan()
	{
		System.out.println("Customer can available for Education Loan");
	}

}
