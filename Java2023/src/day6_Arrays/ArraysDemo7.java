package day6_Arrays;

public class ArraysDemo7 {

	public static void main(String[] args) {
		
		String names[]=new String[10];
		
		names[0]="Shaik";
		names[1]="Surendra";
		names[2]="Reena";
		names[3]="Afjal";
		names[4]="Ananya";
		names[5]="Anand";
		names[6]="Ananya";
		names[7]="Anas";
		names[8]="Atul";
		names[9]="Bibhash";
		
		for(String name:names)
		{
			System.out.println(name);
			
			if(name.contains("An"))
			{
				System.out.println("Found");
				break;
			}
		}
		
	}

}