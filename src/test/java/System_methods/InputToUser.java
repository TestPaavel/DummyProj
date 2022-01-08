package System_methods;

import java.util.Scanner;

public class InputToUser {
	
	public static void main(String[] args)
	{
		Define_Methods refvar=new Define_Methods();
		// refvar.addprintonly(10, 20);
//		 refvar.addprintonly(500, 30);
//		 
//		 int finaltotal=refvar.addreturnonly(100, 20);
		 
		 //refvar.addprintonly(finaltotal, 5);
		 
		 //refvar.addprintonly(refvar.addreturnonly(100, 20), 5);
		 
//		System.out.println("Please enter 2 values to be added");
//		 Scanner sc=new Scanner(System.in);
//		 int First=sc.nextInt();
//		 int Second=sc.nextInt();
//		 sc.close();
		 
		// refvar.addprintonly(First, Second);
		 
		 System.out.println("Please enter CountryCapital");
		 Scanner sc1=new Scanner(System.in);
		 String inputfromUser=sc1.next();
		 sc1.close();
		 
		 refvar.CountryCapital(inputfromUser);
	}

}
