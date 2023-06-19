package day16_Set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {

	public static void main(String[] args) {
		
		Set<String> hs2 = new HashSet<>();
		
		hs2.add("Sai Pragna");
		hs2.add("Rajesh");
		hs2.add("Pragna");
		hs2.add("Nani");
		hs2.add("Munny");
		
		
		//How to retrieve a Value
		
		for (String name : hs2) {
			System.out.println(name);
			if(name.equalsIgnoreCase("munny"))
			{
				System.out.println("User Found");
				break;
			}
			
			
		}
		

	}

}
