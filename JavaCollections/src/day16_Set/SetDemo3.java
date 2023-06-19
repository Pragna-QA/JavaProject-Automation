package day16_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo3 {

	public static void main(String[] args) {
		
		List<String> courses =Arrays.asList("Selenium","Java","Selenium","Python","Cucumber","Python","Maven");
		System.out.println("The Courses in the List are : " +courses);
		
		//Convert List to Set
		Set<String> hs3 = new HashSet<>(courses);
		System.out.println("The Courses in the Set are : " +hs3);
		
		

	}

}
