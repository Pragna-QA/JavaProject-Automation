package day9;

public class ConstructorEmployee2 {
	
	int salary;  //By Default int value is 0
	String email; // by Default String value is NULL
	int empId;
	String depart="Testing";
	
	
	

	public static void main(String[] args) {
		
		ConstructorEmployee2 emp1 = new ConstructorEmployee2(40000,"P@gmail.com",22, "") ;
		ConstructorEmployee2 emp2 = new ConstructorEmployee2(50000, "k@gmail.com",32, "QA"); 
		ConstructorEmployee2 emp3 = new ConstructorEmployee2(60000, "n@gmail.com",42, "Tester");
		ConstructorEmployee2 emp4 = new ConstructorEmployee2(80000, "s@gmail.com",12, "Dev");
		
		System.out.println(emp1.depart);
		System.out.println(emp2.email);
		System.out.println(emp3.empId);
		System.out.println(emp4.salary);
		emp1.depart ="Devops";
		System.out.println(emp1.depart);
		System.out.println(emp2.depart);
		System.out.println(emp3.depart);
		System.out.println(emp4.depart);
		
		
		
		
	}
	
	public ConstructorEmployee2(int sal,String mail,int eid,String dept)
	{
		System.out.println("Constructor Called");
		salary = sal;
		email = mail;
		empId = eid;
		depart = dept;
	}
	
	}

