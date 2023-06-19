package day14_arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo4 {

	public static void main(String[] args) 
	{
		
		System.out.println("Start");
		System.out.println("*******************************");
		

		ArrayList al1 = new ArrayList();  
		
		
		al1.add("Pragna");
		al1.add("Rajesh");
		al1.add("Nandana");
		al1.add("Vishrutha");
		al1.add("Pranu");
		al1.add("Sharwan");
		al1.add("Rajesh");
		al1.add("Pragna");
		
		for (int i=0;i<al1.size();i++)
		{
			//System.out.println(al1.get(4));
			//System.out.println(al1);
			//System.out.println(al1.size());
			//break;
		}
		
		for (Object obj:al1)
		{
			System.out.println(obj);
		}
		
		System.out.println("*******************************");
		System.out.println("End");
		
	

	}

}
