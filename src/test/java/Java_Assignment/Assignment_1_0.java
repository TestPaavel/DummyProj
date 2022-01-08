//To check the number is less than 300, equal to 300 or greater than 300 and print it

package Java_Assignment;

import java.util.Scanner;

public class Assignment_1_0 {
	
	public static void main(String[] args)
	{
		System.out.println("Enter Bill amount");
		Scanner sc=new Scanner(System.in);
		int BillAmount=sc.nextInt();
		sc.close();
		
		if(BillAmount<300)
		{
			System.out.println("Enter any number less than 300");
			
		}
		
		else if(BillAmount>300)
		{
			System.out.println("Enter any number greater than 300");
		}
		
		else
		{
			System.out.println("Entered number is equal to 300");
		}
	}

}
