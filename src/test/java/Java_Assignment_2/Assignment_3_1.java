package Java_Assignment_2;

import java.util.Scanner;

public class Assignment_3_1 {
	
	public static void main(String[] args)
	{
		Assignment_3 refvar=new Assignment_3();
		System.out.println("Please enter any 2 numbers");
		Scanner sc=new Scanner(System.in);
		int result = 0;
		int a=sc.nextInt();
		int b=sc.nextInt();
		char operation=sc.next().charAt(0);
		sc.close();
		
		switch (operation)
		{
		case 0: 
			System.out.println("Please enter any 2 numbers");
			refvar.Add(a,b);
			System.out.println(result);
		break;
		
		case 1: 
			refvar.Subtract(a,b);
			System.out.println(result);
		break;
		
		case 2: 
			refvar.Multiply(a,b);
			System.out.println(result);
		break;
		
		case 3: 
			refvar.Divide(a,b);
			System.out.println(result);
		break;
		
		default:
			System.out.println("Invalid operator");
			return;
			
		}	
	}

	

	

	
	
}
