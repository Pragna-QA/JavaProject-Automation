package day3_Strings;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Selenium WebDriver"  ;
		String NewName = " Selenium WebDriver ";
		System.out.println(name);
		System.out.println(NewName);
		System.out.println(name.toUpperCase());
		System.out.println(NewName.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(NewName.toLowerCase());
		System.out.println(NewName.charAt(2));
		System.out.println(name.charAt(4));
		System.out.println(NewName.length());
		System.out.println(name.length());
		System.out.println(name.substring(4));
		System.out.println(name.substring(2,12));
		System.out.println(name.contains("Selenium"));
		System.out.println(NewName.contains("WebDriver"));
		System.out.println(NewName.contains("webdriver"));
		System.out.println(name.trim());
		System.out.println(NewName.trim());
		System.out.println(name.equals(NewName));
		System.out.println(name.equalsIgnoreCase(NewName));
		String str1 = "Hello World";
		System.out.println(str1.replace("World", "JAVA Program"));
		String str2 = "Welcome";
		String str3 = str2.replace("Welcome","Welcome to Programming");
		System.out.println(str1);
		System.out.println(str3);
		String msg = "Total Amount Due is 245$";
		String arr[] = msg.split(" ");
		System.out.println(arr[4]);
		
		
		

	}

}
