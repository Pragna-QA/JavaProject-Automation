package day17_18_Map;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo7 {

	public static void main(String[] args) {
		
		Map<String, Object> hm1 = new TreeMap<>();
		hm1.put("Name", "Pragna");
		hm1.put("Age", 28);
		hm1.put("Place", "USA");
		hm1.put("Salary", 120.22);
		hm1.put("Married", false);
		//hm1.put(null, "Hyderabad"); //It throws null pointet Exception for Null key and values	
		
		System.out.println(hm1);

	}

}
