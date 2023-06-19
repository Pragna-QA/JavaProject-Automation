package day8;

public class CarTask {

	int numofwheels=4;
	String color="Red";
	
		public static void main(String[] args) {
		
		CarTask Car1 = new CarTask();
		Car1.drivingmethod();
		System.out.println("Benz Car Color is : "+Car1.color);
		System.out.println("No of Wheels of a car has : "+Car1.numofwheels);
		System.out.println("*********************************");
		
		CarTask Car2 = new CarTask();
		Car2.drivingmethod();
		System.out.println("Tesla Car Color is : "+Car2.color);
		System.out.println("No of Wheels of a car has : "+Car2.numofwheels);
		System.out.println("*********************************");
		
		CarTask Car3 = new CarTask();
		Car3.drivingmethod();
		System.out.println("Ford Car Color is : "+Car3.color);
		System.out.println("No of Wheels of a car has : "+Car3.numofwheels);
		
		}
	
	
	public void drivingmethod()
	{
		System.out.println("We can drive the Car");
	}
	
}
