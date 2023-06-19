package day6_Arrays;

public class ArraysDemo8 {

	public static void main(String[] args) {
	
		int arr1[] = new int[3];
		int arr2[] = new int[3];
		
		arr1[0] = 120;
		arr1[1] = 230;
		arr1[2] = 340;
		
		arr2 = arr1;
		
		System.out.println(arr2[2]); //340
		
		arr1[1] = 550;
		
		System.out.println(arr2[1]);
		
	}

}
