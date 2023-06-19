package day8;

public class Employee {
	
	String name;
	boolean status;
	String email;
	int empId;

	public static void main(String[] args) {
		
		Employee Pragna = new Employee();
		Pragna.TestApplication();
		
		Employee Rajesh = new Employee();
		Rajesh.devops();
		
		Employee SaiPragna = new Employee();
		SaiPragna.writecode();
		System.out.println(SaiPragna.empId);
		
		
	}
	
	public void writecode()
	{
		System.out.println("Dev will write the code");

	}
	
	public void TestApplication()
	{
		System.out.println("Testers will test the application");
	}
	
	public void devops()
	{
		System.out.println("Devops will be performing all Devops task");
	}

}
