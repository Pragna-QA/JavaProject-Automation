package day16_Set;

import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		
		
		HashSet<String> hs1 = new HashSet<>();
		
		hs1.add("Rajesh");
		hs1.add("Pragna");
		hs1.add("rajesh");
		hs1.add("Sai");
		hs1.add(null);
		hs1.add("Sai");
		hs1.add("Munny");
		hs1.add("Nani");
		
		System.out.println(hs1);
		//hs1.size();
		System.out.println("The Size of the Set is : " +hs1.size());
		System.out.println(hs1.contains("Munny"));
		hs1.remove(null);
		System.out.println(hs1);
		//hs1.clear();
		//System.out.println(hs1);
		System.out.println("The Size of the Set is : " +hs1.size());

	}

}
