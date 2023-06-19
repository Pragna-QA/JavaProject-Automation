package finalKeyword;

public class PrivateVariableDemo {
	
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private String email;
	private int age;
	
	public PrivateVariableDemo(String name, String email, int age) 
	
	{
		this.name=name;
		this.email=email;
		this.age=age;
	}

}
