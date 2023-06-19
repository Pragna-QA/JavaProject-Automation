package day17_18_Map;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<String, String>hm1 = new HashMap<>();
		hm1.put("Pragna", "Selenium");
		hm1.put("Rajesh", "Java");
		hm1.put("SaiPragna", "Appium");
		hm1.put("Pragna", "Jenkins");
		hm1.put(null, "Github");
		hm1.put(null, "GIT");
		hm1.put("Ravi", null);
		//hm1.put(1, "Oracle"); //The Method INT and String are not applicable as Key and Value//
		System.out.println(hm1);
		System.out.println(hm1.get("Rajesh"));
		System.out.println(hm1.get("Pragna"));
		System.out.println(hm1.get(null));
		System.out.println(hm1.get("Ravi"));
		//System.out.println(hm1.get("Nandu")); //It throws Null if the key is not present

	}

}
