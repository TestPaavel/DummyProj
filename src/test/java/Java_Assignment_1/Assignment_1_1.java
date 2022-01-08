package Java_Assignment_1;

import java.util.Scanner;

public class Assignment_1_1 {
	
	public static void main(String[] args)
	{
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);
		int Number=sc.nextInt();
		sc.close();
		
		switch (Number)
		
		{
	    case 0:
		System.out.println("Sunday");
		break;
		
	    case 1:
			System.out.println("Monday");
			break;
			
	    case 2:
			System.out.println("Tuesday");
			break;
			
	    case 3:
			System.out.println("Wednesday");
			break;
			
	    case 4:
			System.out.println("Thursday");
			break;
			
	    case 5:
			System.out.println("Friday");
			break;
			
	    case 6:
			System.out.println("Saturday");
			break;
			
			default:
				System.out.println("Number is not valid");
			
		}
		
		
	}

}
