package day5_loops;

public class WhileLoopDemo2 {
	public static void main(String[] args) {
		
		int x =1, sum =0;
		
		//Exit when x becomes greater than 4
		
		while (x<=10)
		{
			
			//Summing up with x
			sum = sum+x;
			
			//Incrementing the value x for next iteration
			x++;
			
		}
		
		System.out.println("Summaration " + sum);
		
	}
}
