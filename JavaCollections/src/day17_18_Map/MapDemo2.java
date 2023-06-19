package day17_18_Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {

	public static void main(String[] args) {
		
		Map<String, Object> hm2 = new HashMap<>();
		
		hm2.put("Name", "Pragna");
		hm2.put("Age", 30);
		hm2.put("Job", "Engineer");
		hm2.put("Address", "USA");
		hm2.put("Salary", 100.5);
		
		System.out.println(hm2.get("Salary"));
		System.out.println(hm2);
		
	}
	

}
