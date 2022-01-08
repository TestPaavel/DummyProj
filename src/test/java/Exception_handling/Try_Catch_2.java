package Exception_handling;

public class Try_Catch_2 {
	
//	public static void main(String[] args)
//	{
//		Try_Catch_2 a1= new Try_Catch_2();
//		
//		// Handling Exception at method calling level
//		//a1.division(9,0);
//		
//		try
//		{
//			a1.division(9,0);
//		}
//		
//		catch(Exception e)
//		{
//			e.printStackTrace();
//			System.out.println("An Exception occurred at division of integer c");
//		}
//	}
//	
//	public void division(int a, int b)
//	{
//		int c= a/b;
//		System.out.println("The division of input " + a + " and " + b + " is -> " + c);
//	}
	
	public static void main(String[] args)
	{
		Try_Catch_2 a1= new Try_Catch_2();
		a1.division(9,0);
		
		
	}
	
	public void division(int a, int b)
	{
		try
		{
			int c= a/b;
			System.out.println("The division of input " + a + " and " + b + " is -> " + c);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("An Exception occurred inside division method");
		}
		
	}

}
