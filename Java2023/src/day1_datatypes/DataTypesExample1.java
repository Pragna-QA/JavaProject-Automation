package day1_datatypes;

public class DataTypesExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Start");
		
		//The byte data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive).
		
		byte Marks = 122;
		
		System.out.println(Marks);
		
		//Casting Down
		byte NewMarks = (byte) 130;
		
		System.out.println(NewMarks);
		
		System.out.println(Marks+NewMarks);
		
		//The short data type is a 16-bit signed two's complement integer. It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).
		
		short total=40;
		
		System.out.println(total);
		
		//DownCasting 
		
		short sum=(short) 32778;
		
		System.out.println(sum);
		
		//UpCasting
		
		short num=32745;
		System.out.println(num);
		
		
		
		//By default, the int data type is a 32-bit signed two's complement integer
		
		int number=100;
		
		System.out.println(number);
		
		
		//The long data type is a 64-bit two's complement integer.
		
		long value=1234567889;
		System.out.println(value);
		
		//Using literal
		long value1=8764598762l;
		System.out.println(value1);
		
		
		System.out.println("Exit");

	}

}
