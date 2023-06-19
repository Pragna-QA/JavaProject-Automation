package day5;

import java.util.Scanner;

public class Average_Assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers to print till : ");
		int a = sc.nextInt();
		int sum=0, count=0;
		
		for (int i=0; i<=a;i++)
			if ((i%2)==0)
			{
				//System.out.println(i);
				sum = sum+i;
				count++;
		}
			
		double avg = sum/count;
		System.out.println("The Average of Even numbers from 0 to " +a+ " is : " + avg);
		sc.close();		
	}
}
