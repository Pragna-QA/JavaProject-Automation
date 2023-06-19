package day6_Arrays;

public class ArraysDemo4 {

	public static void main(String[] args) {
		
		String []names=new String[10];
		
		names[0]="Shaik";
		names[1]="Surendra";
		names[2]="Reena";
		names[3]="Afjal";
		names[4]="Akbar";
		names[5]="Anand";
		names[6]="Ananya";
		names[7]="Anas";
		names[8]="Atul";
		names[9]="Bibhash";
		
		//System.out.println(names.length);
	
		for(int i=0;i<names.length;i++)
		{
			String personName=names[i];
			
			System.out.println("Current name "+personName);
			
			if(personName.equalsIgnoreCase("Anas"))
			{
				System.out.println("Koi Mil Gaya - Found Anas");
				break;
			}
			
		}
		
		
	}

}