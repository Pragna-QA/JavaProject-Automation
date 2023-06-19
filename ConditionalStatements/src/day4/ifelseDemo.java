package day4;

public class ifelseDemo {

	public static void main(String[] args) {
		
		String BrowserName= "Mozilla";
		
		if(BrowserName.equalsIgnoreCase("Chrome") || BrowserName.contains("Firefox"))
		{
			System.out.println("Firefox Session Started");
		}
		else if(BrowserName.equalsIgnoreCase("GC"))
		{
			System.out.println("Chrome Session Started");
		}
		else if(BrowserName.equalsIgnoreCase("Safari"))
		{
			System.out.println("Firefox Session Started");
		}
		else
		{
			System.out.println("Sorry we don't support this browser");
		}

	}

}
