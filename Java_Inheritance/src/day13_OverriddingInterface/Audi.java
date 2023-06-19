package day13_OverriddingInterface;

public class Audi  extends Car{

	public static void main(String[] args) {
		
		Audi a1 = new Audi();
		a1.drive();
		a1.stop();
		
		Car c1 = new Car();
		c1.drive();
		
		Car c2 = new Audi();
		c2.drive();
		
		
		//If Base Class/Parent Class has a method and if the child class extending the base class which also have the same method but with different implementation
		//Overriding mean Base class and child class has same methods with different implementation. This is known as "Late Binding/Run Time Polymorphism".Depends on the reference it will decide which method needs to call that's why it known as Late Binding.
		

	}
	
	public void drive()
	{
		System.out.println("You can drive AUDI");
	}
	
	public void stop()
	{
		System.out.println("You can stop the car");
	}

}
