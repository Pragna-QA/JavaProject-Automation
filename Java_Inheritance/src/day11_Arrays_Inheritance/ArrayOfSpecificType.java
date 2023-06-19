package day11_Arrays_Inheritance;

public class ArrayOfSpecificType {

	public static void main(String[] args) {
		
		Humans arr[]= new Humans[4];

		Humans Sai = new Humans("Female", "USA");
		Humans Rajesh = new Humans("Male", "USA");
		Humans Manu = new Humans("Female", "Hyd");
		Humans Raju = new Humans("Female", "Hyd");
		
		arr[0]= Sai;
		arr[1]= Rajesh;
		arr[2]= Manu;
		arr[3]= Raju;
		
		
		
		System.out.println(arr[3].type);
		System.out.println(arr[2].location);
		System.out.println(arr[0].type);
		System.out.println(arr[1].location);
		
		

	}

}
