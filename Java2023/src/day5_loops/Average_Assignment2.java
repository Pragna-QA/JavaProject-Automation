package day5_loops;

import java.util.Scanner;

public class Average_Assignment2 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Get the even numbers till: ");
		int num = sc1.nextInt();
		int sum=0, count=0;
		
		for (int j=0;j<=num ;j++)
			if((j%2)==0)
			{
				//System.out.println("The List of Even numbers from 0 to 100 are : " +j);
				sum = sum +j;
				count++;
			}
		
		double avg = sum/count;
		System.out.println("The Average of all Even numbers from 0 to " +num + " is : "  +avg);
		sc1.close();
		
	}
}
