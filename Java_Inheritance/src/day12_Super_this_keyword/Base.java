package day12_Super_this_keyword;

public class Base {
	
	
	//1.1
	public  Base()
	{
		System.out.println("In Base Class Cons with 0 Arguments");
	}
	
	
	//1.2
	public Base(int a)
	{
		System.out.println("In Base Class Cons with 1 Arguments "+a);
	}
	
	
	//1.3
	public Base(int a, int b)
	{
		System.out.println("In Base Class Cons with 2 Arguments "+a + " "+ b);
	}

}
