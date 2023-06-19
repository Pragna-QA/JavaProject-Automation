package day17_18_Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo5 {

	public static void main(String[] args) {
		
		
		// Student - 2 Skills
			// Pragna - Java, JS
		    // Rajesh   - Selenium,Cypress,PW
		    // Nandu- Git,Github,Jenkins, CircleCI
		
		Map<String, List<String>> allValues=new HashMap<>();
		
		allValues.put("Pragna", Arrays.asList("Java","JS"));
		
		allValues.put("Rajesh", Arrays.asList("Selenium","Cypress","PW"));
		
		allValues.put("Nandu", Arrays.asList("Git","Github","Jenkins","CircleCI"));
		
		
		System.out.println(allValues.get("Pragna"));
		System.out.println(allValues.get("Rajesh").get(0));
		System.out.println(allValues.get("Nandu").get(2));
		

	}

}
