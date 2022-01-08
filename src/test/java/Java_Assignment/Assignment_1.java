//To add tax on basis of bill amount and print the total amount
//Conditions
//1. Bill amount is under 300 or equal to 300 add Rs50 as tax
//2. Bill amount is more than 300 or equal to 500 add Rs20 as tax
//3. Bill amount is more than 500 or equal to 1000 add Rs10 as tax
// Bill amount is more than 1000 no tax

package Java_Assignment;

import java.util.Scanner;

public class Assignment_1 {
	
	public static void main(String[] args)
	{
		System.out.println("Please enter any values to be");
		Scanner sc=new Scanner(System.in);
		int Number=sc.nextInt();
		sc.close();

	
		int x=500;
//		if(x<=300)
//		{
//			System.out.println("Bill amount is less than or equal to 300 add tax Rs50: " + (x+50));
//		}
//		
//		if(x==300||x==500)
//		{
//			System.out.println("Bill amount is more than 300 or equal to 500 add tax Rs20: " + (x+20));
//		}
//		
//		else if(x==500||x==1000)
//		{
//			System.out.println("Bill amount is more than 500 or equal to 1000 add tax Rs10: " + (x+10));
//		}
//		
//		else if(x>1000)
//		{
//			System.out.println("No tax to be added");
//		}
//		
//}

}
