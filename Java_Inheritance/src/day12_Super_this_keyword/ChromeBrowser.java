package day12_Super_this_keyword;

public class ChromeBrowser extends Base{
	
	public ChromeBrowser()
	{
		this("AdBlocker");
		System.out.println("Started Chrome with Default Settings");
	}
	
	public ChromeBrowser(String Plugin)
	{
		this(Plugin, 119);
		System.out.println("Started Chrome with "+Plugin +" Plugin");
	}
	
	public ChromeBrowser(String Plugin, int Version)
	{
		System.out.println("Started Chromw with "+Plugin +" Plugin"+ "Browser Version is "+Version);
	}

	public static void main(String[] args) {
		
		ChromeBrowser browser = new ChromeBrowser();
		

	}

}
