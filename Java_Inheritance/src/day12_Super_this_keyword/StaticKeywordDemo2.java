package day12_Super_this_keyword;

public class StaticKeywordDemo2 {
	
	static String name ="Sai Pragna";
	String studentName;
	String email;
	
	public StaticKeywordDemo2(String studentName, String email)
	{
		this.studentName=studentName;
		this.email=email;
				
	}
	

	public static void main(String[] args) 
	{
		StaticKeywordDemo2.showResult();
		StaticKeywordDemo2 obj1 = new StaticKeywordDemo2("Sai","sai@gmail.com");
	
	}
	public static void showResult()
	{
		
		
		System.out.println(name);
		fun1();
		fun2();
		fun3();
		StaticKeywordDemo2.name="Pragna";
		System.out.println(name);
		
				
	}
	
	public static void fun1()
	{
		System.out.println("Fun1");
		
	}
	
	public static void fun2()
	{
		System.out.println("Fun2");
		
	}
	
	public static void fun3()
	{
		System.out.println("Fun3");
		
	}
	
	
}


