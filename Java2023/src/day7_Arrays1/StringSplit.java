package day7_Arrays1;

public class StringSplit {

	public static void main(String[] args) {
		
	String msg= "Welcome to Java Programming" ;
	
	String []arr=msg.split(" ");
	
	//System.out.println(arr[0]);
	
	//System.out.println(arr[1]);
	//System.out.println();

	System.out.println(arr.length);
	
	System.out.println(arr[arr.length-1]);
	System.out.println(arr[arr.length-2]);
	System.out.println(arr[arr.length-3]);
	
		

	}

}
