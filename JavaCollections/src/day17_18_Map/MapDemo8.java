package day17_18_Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo8 {

	public static void main(String[] args) {
		
		Map<String, Object> hm2 = new HashMap<>();
		hm2.put("Name","Rajesh");
		hm2.put("Age", 30);
		hm2.put("Married", false);
		hm2.put("City", "Chennai" );
		//hm2.put("City", "Hyd" );
		hm2.put("Salary",120.5 );
		hm2.put(null, "Bangalore");
		//hm2.put(null, "Hyd");
		
		System.out.println("The Results are "+ hm2);
		System.out.println("All Keys are "+ hm2.keySet());
		System.out.println("All Values are "+ hm2.values());
		
		

	}

}
