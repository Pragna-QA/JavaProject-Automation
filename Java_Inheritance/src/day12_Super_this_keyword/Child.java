package day12_Super_this_keyword;

public class Child extends Base{
	
	//1
	public Child()
	
	{
		System.out.println("Child Class Cons called with 0 Arguments");
	}
	
	
	//2
	
	public Child(int a)
	{
		//super(a);  // Super means two classes where other classes also involved in this.
		//this refers to Current Class, Super refers to Parent Class
		System.out.println("Child Class Cons called with 1 Arguments "+a);
	}
	
	
	//3
	public Child(int a, int b)
	{
		//super();
		System.out.println("Child Class Cons called with 2 Arguments "+a + " "+ b);
	}

	public static void main(String[] args) {
		
		Child C1 = new Child(10,20);
		
		

	}

}
