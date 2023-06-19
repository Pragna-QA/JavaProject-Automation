package day7_Arrays1;

public class StringSplit2 {

	public static void main(String[] args) {
		
		String text = "I want Pizza, It will cost 250 USD";
		
		//String arr[] = text.split(" ");
		
		System.out.println(text.split(" "));
		
		System.out.println(text.split(" ")[text.split(" ").length-6]);
	
		

	}

}
