package day14_arrayList;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		
		System.out.println("Start");
		System.out.println("*******************************");
		
		//No Type, No Limit
		ArrayList al1 = new ArrayList();
		
		al1.add(22);
		al1.add("Pragna");
		al1.add(233.45);
		al1.add(true);
		al1.add(null);
		al1.add(null);
		al1.add(22);
		
		System.out.println(al1.size());
		System.out.println(al1.get(3));
		System.out.println(al1.get(2));
		System.out.println(al1);
		al1.remove(5);
		System.out.println(al1.size());
		System.out.println(al1);
		
		System.out.println("*******************************");
		System.out.println("End");
		
	

	}

}
