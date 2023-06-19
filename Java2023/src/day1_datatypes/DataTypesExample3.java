package day1_datatypes;

public class DataTypesExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("Start");
		
		//The byte data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive).
		
		byte Marks = 122;
		System.out.println(Marks);
		
		//Casting Down
		byte NewMarks = (byte) 130;
		System.out.println(NewMarks);
		
		//Upcasting
		byte Markssheet= 112;
		short a=Markssheet;
		System.out.println(a);
		
		
		System.out.println(Marks+NewMarks);
		
		System.out.println("Exit");

	}

}
