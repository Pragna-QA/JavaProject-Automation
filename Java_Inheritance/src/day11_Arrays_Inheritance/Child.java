package day11_Arrays_Inheritance;

public class Child extends Parent{
	
	
	String newName = "Derived";

	public static void main(String[] args) {
		
		//Child Class
		Child c= new Child();
		c.display();
		
		
		//Base Class or Parent Class
		c.show();
		
		System.out.println(c.name); // Parent Class
		System.out.println(c.newName); // Child CLass
		

	}
	
	public void display()
	{
		System.out.println("Display method from the Child Class");
	}

}
