package day7_Arrays1;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		String arr[][]= new String[3][3];
		
		arr[0][0] = "Selenium" ;
		arr[0][1] = "Python" ;
		arr[0][2] = "JavaSciript" ;
		arr[1][0] = "Automation Engineer" ;
		arr[1][1] = "Software Developer" ;
		arr[1][2] = "Database Administrator" ;
		
		System.out.println(arr[1][2]);
		System.out.println(arr[0][2]);

	}

}
