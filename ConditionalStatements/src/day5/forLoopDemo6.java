package day5;

public class forLoopDemo6 {

public static void main(String[] args) {
		
		System.out.println("Start");
		
		String name ="Selenium WebDriver";
		
		for(int i=0; i<name.length();i++)
		{
			System.out.println(name);
			break;
			//System.out.println(name.charAt(4));
		}
		
		
		//ForEach/Inhanced Loop
		
		String names[] = {"Sai" , "Java" ,"Selenium", "API"};
		for (String a:names)
		{
			System.out.println(a);
		}
		System.out.println("End");
	}

}
