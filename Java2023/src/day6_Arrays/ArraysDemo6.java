package day6_Arrays;

public class ArraysDemo6 {

	public static void main(String[] args) {
		
		String names[]= new String[6];
		
		names[0] = "Sukansh";
		names[1] = "Sukanya" ;
		names[2] = "Srivarna";
		names[3] = "Srividya";
		names[4] = "Suren" ;
		names[5] = "Swetha" ;
		
		for(String name:names)
		{
			System.out.println(name);
			
			if(name.contains("ri"))
			{
				System.out.println("Found the Match");
				break;
						
			}
		}
	}

}