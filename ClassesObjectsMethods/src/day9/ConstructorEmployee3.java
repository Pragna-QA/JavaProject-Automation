package day9;

public class ConstructorEmployee3 {
	
	int empId;
	String name;
	int Salary;
	String email;
	String depart;
	
	public static void main(String[] args) {
		
		System.out.println("Start");
		System.out.println("******************");
		
		ConstructorEmployee3 emp1 = new ConstructorEmployee3();
		ConstructorEmployee3 emp2 = new ConstructorEmployee3();
		ConstructorEmployee3 emp3 = new ConstructorEmployee3();
		ConstructorEmployee3 emp4 = new ConstructorEmployee3();
		
		emp1.empId=1;
		emp1.name = "Pragna";
		emp1.Salary=50000;
		emp1.email="p@test.com";
		emp1.depart = "Test Engineer";
		System.out.println(emp1.email);
		System.out.println(emp1.depart);
		
		
		System.out.println("******************");
		
		
		emp2.empId=23;
		emp2.Salary=75000;
		emp2.name="Rajesh";
		emp2.depart="Devops";
		emp2.email="Ra@test.com";
		System.out.println(emp2.name);
		System.out.println(emp2.depart);
		System.out.println(emp2.Salary);
		
		System.out.println("******************");
		
		emp3.empId=43;
		emp3.name="Sai Pragna";
		emp3.depart="Automation Tester";
		emp3.Salary=70000;
		emp3.email="pragna@test.com";
		System.out.println(emp3.empId);
		System.out.println(emp3.name);
		System.out.println(emp3.depart);
		System.out.println(emp3.email);
		
		System.out.println("******************");
		
		emp4.depart="QA Lead";
		emp4.empId=16;
		emp4.Salary=80000;
		emp4.name="Munny";
		emp4.email="munny@test.com";		
		System.out.println(emp4.empId);
		System.out.println(emp4.name);
		System.out.println(emp4.email);
		System.out.println(emp4.depart);
		System.out.println(emp4.Salary);
		
		
		System.out.println("******************");		
		System.out.println("End");	
		
		
	}
	
	}

