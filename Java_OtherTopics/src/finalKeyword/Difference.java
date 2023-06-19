package finalKeyword;

public class Difference {

	public static void main(String[] args) {
		
		String name = "Selenium";
		
		name.concat("WebDriver"); //Strings are Immutable
		
		System.out.println(name);
		
		String newName = name.concat("WebDriver");
		
		System.out.println(newName);
		
		StringBuffer name1 = new StringBuffer();
		name1.append("Selenium");
		name1.append("WebDriver");
		name1.append("Maven");
		
		System.out.println(name1);
		

	}

}
