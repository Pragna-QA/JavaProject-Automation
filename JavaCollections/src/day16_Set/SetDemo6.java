package day16_Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo6 {

	public static void main(String[] args) {
		
		Set<String> s1 = new LinkedHashSet<>();
		
		s1.add("Apples");
		s1.add("Bananas");
		s1.add("Grapes");
		s1.add("Oranges");
		s1.add("Grapes");
		s1.add("WaterMelon");
		s1.add("Kiwi");
		s1.add(null);
		
		System.out.println(s1);

	}

}
