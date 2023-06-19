package day15_collection2;

//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		
		
		List<String> l1 = Arrays.asList("Rajesh","Pragna","Munny","Nani");
		List<String> l2 = Arrays.asList("Manu","Pranu","Sharwan","Nandu","Vishru");
		//List<String> l3 = Arrays.asList("Rasagna","Manogna","Sruthi","Suyagna","Rajesh","Sai Pragna");
		
		//List<List<List<String>>> myStudents1 = new ArrayList<>();
		//myStudents1.add(l1);
		
		
		
		
		List<List<String>> myStudents = new ArrayList<>();
		myStudents.add(l1);
		myStudents.add(l2);
		
		System.out.println(myStudents.get(0).get(3));
		System.out.println(myStudents.get(1).get(2));

	}

}
