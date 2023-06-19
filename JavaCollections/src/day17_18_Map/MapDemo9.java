package day17_18_Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo9 {

	public static void main(String[] args) {
		
		
		Map<String, Object> hm2 = new LinkedHashMap<>();
		hm2.put("Name","Rajesh");
		hm2.put("Age", 30);
		hm2.put("Married", false);
		hm2.put("Salary",120.5 );
		hm2.put("City", "Chennai" );
		
		
		//for (String str : hm2.keySet()) {
		
			//System.out.println(str);
		//}
		
		
		//for (Object str : hm2.values()) {
			
			//System.out.println(str);
		//}
		
		Set<Entry<String, Object>> es1=hm2.entrySet();
		
		
		
		for(Entry<String, Object> e1:es1)
		{	
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			
		}
		

	}

}
