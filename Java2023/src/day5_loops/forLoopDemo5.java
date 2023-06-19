package day5_loops;

public class forLoopDemo5 {

public static void main(String[] args) {
		
		
			
			System.out.println("Start");
			
			for(int i=2;i<=100;i=i+4)
			{
				System.out.println(i);
				
				if(i==50)
				{
					System.out.println("Found");
					break;
				}	
			}
			
			System.out.println("End");
			
		}

	}