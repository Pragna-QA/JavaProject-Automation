package finalKeyword;

public class Class2 {

	public static void main(String[] args) {
		
		Class2 obj1 = new Class2();
		obj1.m1();
	}
	
	
	//We can't extend the class when we use the final keyword
	public void m1()
	{
		System.out.println("Iam in Class2, m1 Method");
	}

}
