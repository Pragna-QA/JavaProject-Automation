package day13_OverriddingInterface;

public class SBI implements RBI,Gov
{

	public static void main(String[] args) 
	{
		//1 - Child Class reference and Child Class Objects
		//SBI bank1 = new SBI();
		//bank1.deposit();
		//bank1.kyc();
		//bank1.citizenship();
		
		//2 - Interface reference and Interface object - No No No not allowed
		//RBI r1 = new RBI();//Untill our class is fully implemented We can't create the object of interface. we can create only references
		
		
		//3 - Reference of Interface and Object of Class - Only we can call method of Interface
		RBI r2 = new SBI();
		r2.kyc(); //Overriding
		//RBI.home_int_rate=10; //
		System.out.println(RBI.home_int_rate);
		
		
		//4 - Reference of Child Class and Object of Interface - No No No not allowed
		//ICICI bank2 = new RBI();
		
	}
	
	public void kyc()
	{
		System.out.println("Every Customer will do offline KYC");	
	}
	
	public void deposit()
	{
		System.out.println("Customer can deposit amount");
	}

	
	public void citizenship() 
	{
		System.out.println("We are based in India");
		
	}

}
