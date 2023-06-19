package day9;

public class ConstructorEmployee {
	
	int empId;
	String name;
	int salary;
	String email;

	public static void main(String[] args) {
		
		ConstructorEmployee emp1 = new ConstructorEmployee(10, "Pragna", 50000, "pragna@gmail.com");
		ConstructorEmployee emp2 = new ConstructorEmployee(20,"Rajesh",60000,"rajesh@gmail.com");
		ConstructorEmployee emp3 = new ConstructorEmployee(30,"Sai",70000,"sai@gmail.com");
		ConstructorEmployee emp4 = new ConstructorEmployee(40,"Sai Pragna",80000,"sp@gmail.com");
		
		System.out.println(emp1.email);
		System.out.println(emp2.name);
		System.out.println(emp3.empId);
		System.out.println(emp4.salary);
				

	}
	
	
	public ConstructorEmployee(int eid,String names,int sal,String mail)
	{
		System.out.println("Constructor Called");
		empId = eid;
		name = names;
		salary = sal;
		email = mail;
		
		
	}
	}

