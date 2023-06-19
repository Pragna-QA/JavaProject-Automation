package day17_18_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo6 {

	public static void main(String[] args) {
		
		Map<String, Object> hm1 = new LinkedHashMap<>();
		hm1.put("Name", "Sai Pragna");
		hm1.put("Age", 26);
		hm1.put("Place", "USA");
		hm1.put("Salary", 100.22);
		hm1.put(null, "Chennai");
		//hm1.put(null, "Hyderabad");
		hm1.put("Married", false);
		//hm1.put(null, "Bangalore");
		
		System.out.println(hm1);

	}

}
