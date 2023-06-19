package day6_Arrays;

public class ArraysDemo3 {

	public static void main(String[] args) {
		
		String Courses[]= new String[6];
		
		Courses[0] = "Selenium";
		Courses[1]= "Python";
		Courses[2]= "Java" ;
		Courses[3]= "API";
		Courses[4]= "Testing";
		Courses[5] = "JIRA" ;
		
		for(int i=0; i<=6; i++)
		{
			String Technology= Courses[i];
			System.out.println("Current Name " +Technology);
			
			if(Technology.equalsIgnoreCase("Java"))
			{
				System.out.println("User Found");
				break;
			}
			
		}
			
		
		//System.out.println(Courses[2]);
		//System.out.println(Courses[3]);
		//System.out.println(Courses[1]);
		//System.out.println(Courses[4]);
		

	}

}
