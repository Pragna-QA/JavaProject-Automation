package day4_ConditionalStatements;

public class ifelseTask {

	public static void main(String[] args) {
		String tool ="Selenium";
		
		if(tool.equalsIgnoreCase("appium"))
		{
			System.out.println("Mobile Automation Tool");
		}
		else if(tool.contains("Selenium"))
		{
			System.out.println("Web Automation Lib");
		}
		else if(tool.equalsIgnoreCase("rest assured"))
		{
			System.out.println("API Automation Lib ");
		}
		else
		{
			System.out.println("Anything else - Sorry this is not in our database");
		}
	}

}
