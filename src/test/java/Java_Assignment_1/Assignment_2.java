package Java_Assignment_1;

import java.util.Scanner;

public class Assignment_2 {
	
	public static void main(String[] args) 
	{
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		sc.close();
		
		switch (number)
		{
		    case 0:
			System.out.println("Zero");
			break;
			
		    case 1:
		    	System.out.println("One");
		    	break;
		    	
		    case 2:
		    	System.out.println("Two");
		    	break;
		    	
		    case 3:
		    	System.out.println("Three");
		    	break;
		    	
		    case 4:
		    	System.out.println("Four");
		    	break;
		    	
		    case 5:
		    	System.out.println("Five");
		    	break;
		    	
		    case 6:
		    	System.out.println("Six");
		    	break;
		    	
		    case 7:
		    	System.out.println("Seven");
		    	break;
		    	
		    case 8:
		    	System.out.println("Eight");
		    	break;
		    	
		    case 9:
		    	System.out.println("Number Nine");
		    	break;
		    	
		    default:
				System.out.println("Number is not valid");
		}
	}

}
