package day6_Arrays;

public class ArraysDemo5 {

	public static void main(String[] args) {
		
		String []names=new String[10];
		
		names[0]="Nani";
		names[1]="Rajesh";
		names[2]="Pragna";
		names[3]="Munny";
		names[4]="Raju";
		names[5]="Manu";
		names[6]="Shruthi";
		names[7]="Pupy";
		names[8]="Sai";
		names[9]="Bunny";
		
		for (int i=0;i<names.length;i++)
		{
			System.out.println("Current Names is : " +names[i]);
			if(names[i].equalsIgnoreCase("Manu"))
			{
				System.out.println("Name :: Manu Found");
				break;
			}
		}
		
	}

}