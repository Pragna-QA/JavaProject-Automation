package day14_arrayList;

import java.util.ArrayList;

public class ArrayListDemo6 {

	public static void main(String[] args) {
		
		ArrayList<String> arrs = new ArrayList<>();
		arrs.add("Sai");
		arrs.add("Pragna");
		arrs.add("Rajesh");
		arrs.add("Sai Pragna");
		arrs.add("Rajesh");
		
		System.out.println(arrs);
		
		
		ArrayList<String> arrs1 = new ArrayList<>();
		arrs1.add("Pranu");
		arrs1.add("Vishru");
		arrs1.add("Sharwan");
		arrs1.add("Nandu");
		
		System.out.println(arrs1);
		
		arrs.addAll(arrs1);
		
		System.out.println(arrs);
		System.out.println(arrs.size());

	}

}
