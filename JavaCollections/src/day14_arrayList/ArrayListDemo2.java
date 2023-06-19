package day14_arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) 
	{
		
		System.out.println("Start");
		System.out.println("*******************************");
		
		//No Type, No Limit
		ArrayList al1 = new ArrayList();  //al1 can access ArrayList,List, Collection, Iterables and Objects
		
		List al2 = new ArrayList(); //al2 can access List, Collection, Iterables and Objects
		
		Collection al3 = new ArrayList(); //al3 can access Collection, Iterables and Objects
		
		Iterable al4=new ArrayList(); //al4 can access Iterables and Objects
		
		Object al5=new ArrayList(); //al5 can access New ArrayList , Object Class Methods
		
		System.out.println("*******************************");
		System.out.println("End");
		
	

	}

}
