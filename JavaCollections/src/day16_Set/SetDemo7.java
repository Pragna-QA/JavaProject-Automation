package day16_Set;


import java.util.Set;
import java.util.TreeSet;

public class SetDemo7 {

	public static void main(String[] args) {
		
		Set<String> s1 = new TreeSet<>();
		
		s1.add("Apples");
		s1.add("Bananas");
		s1.add("apples");
		s1.add("Grapes");
		s1.add("Oranges");
		s1.add("Grapes");
		s1.add("WaterMelon");
		s1.add("Kiwi");
		//s1.add(null);  //It throws Null Pointer Exception
		
		System.out.println(s1);

	}

}
