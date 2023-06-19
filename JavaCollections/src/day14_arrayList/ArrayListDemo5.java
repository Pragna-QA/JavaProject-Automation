package day14_arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo5 {

	public static void main(String[] args) 
	{
		
		System.out.println("Start");
		System.out.println("*******************************");
		
		ArrayList<Integer> arr= new ArrayList<>();
		arr.add(32);
		arr.add(88);
		arr.add(64);
		arr.add(43);
		arr.add(null);
		arr.add(12);
		System.out.println(arr);
		System.out.println(arr.size());
		System.out.println(arr.get(3));
		
		ArrayList<String> arrs = new ArrayList<>();
		arrs.add("Sai");
		arrs.add("Pragna");
		arrs.add("Rajesh");
		arrs.add("Sai Pragna");
		arrs.add("Rajesh");
		
		System.out.println(arrs);
		
		ArrayList<Boolean> arr1 = new ArrayList<>();
		//ArrayList<Student> al4 = new ArrayList<>();
		
		System.out.println("*******************************");
		System.out.println("End");
		
	

	}

}
