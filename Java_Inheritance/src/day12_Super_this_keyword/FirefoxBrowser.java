package day12_Super_this_keyword;

public class FirefoxBrowser {
	
	String type;
	int version;
	
	
	public FirefoxBrowser(String type, int version)
	{
		this.type = type;
		this.version = version;
	}

	public static void main(String[] args) 
	{
		FirefoxBrowser browser = new FirefoxBrowser("QA" , 201);
		browser.StartBrowser();
		
	}
	
	public void StartBrowser()
	{
		this.openApplicationUrl("http://www.google.com");
		System.out.println("Browser Started");
		
	}
	
	public void openApplicationUrl(String url)
	{
		System.out.println("Application Started with "+url);
		
	}

}
