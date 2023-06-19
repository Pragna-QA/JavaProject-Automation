package day12_Super_this_keyword;

public class StaticKeywordDemo {
	
	static String name ="Rajesh";
	
	String studentName;
	String email;
	
	public StaticKeywordDemo(String studentName, String email)
	{
		this.studentName=studentName;
		this.email=email;
		
	}

	public static void main(String[] args) 
	{
		StaticKeywordDemo Pragna = new StaticKeywordDemo("Pragna","Pragna@gmail.com");
		StaticKeywordDemo Sai = new StaticKeywordDemo("Sai","Sai.com");
		StaticKeywordDemo SaiPragna = new StaticKeywordDemo("SaiPragna","SaiPragna@gmail.com");
		Pragna.displayinfo();
		Sai.displayinfo();
		SaiPragna.displayinfo();
		//StaticKeywordDemo.showResult();
		
		//Static Methods can be access with the help of class name
		//Non-Static Methods they have to access via objects

	}
	
	public static void showResult()
	{
		System.out.println("Result is Pass");
	}
	
	public void displayinfo()
	{
		System.out.println("Student Name is: "+studentName);
		System.out.println("Student Email is: "+email);
		System.out.println("Trainer Name: "+name);
	}

}
