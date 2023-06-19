package day17_18_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo3 {

	public static void main(String[] args) {
		
		
		
		Map<String, Object> hm1 = new HashMap<>();
		
		hm1.put("Name", "Rajesh");
		hm1.put("Age", 34);
		hm1.put("Job", "Developer");
		hm1.put("Address", "California");
		hm1.put("Salary", 110.5);
		
				
		Map<String, Object> hm2 = new HashMap<>();
		
		hm2.put("Name", "Pragna");
		hm2.put("Age", 30);
		hm2.put("Job", "Engineer");
		hm2.put("Address", "USA");
		hm2.put("Salary", 100.5);
		
		
		Map<String, Object> hm3 = new HashMap<>();
		
		hm3.put("Name", "Nandana");
		hm3.put("Age", 3);
		hm3.put("Job", "Baby");
		hm3.put("Address", "India");
		hm3.put("Salary", 120.5);
		
		List<Map<String, Object>> l1 = new ArrayList<>();
		
		l1.add(hm1);
		l1.add(hm2);
		l1.add(hm3);
		System.out.println(l1.get(2));
		System.out.println(l1.get(2).get("Name"));
		
		
		
		//System.out.println(hm2.get("Salary"));
		//System.out.println(hm2);
		
	}
	

}
