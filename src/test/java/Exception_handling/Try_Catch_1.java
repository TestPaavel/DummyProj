package Exception_handling;

public class Try_Catch_1 {
	
	public static void main(String[] args)
	{
//		System.out.println("A");
//		System.out.println("B");
//		System.out.println("C");
//		
//		try
//		{
//			int a = 9/0;
//		}
//		
//		catch(ArithmeticException e)
//		{
//			e.printStackTrace();
//			System.out.println("An Exception occurred at division of integer a");
//		}
//		
//		System.out.println("D");
//		System.out.println("E");
//		System.out.println("F");
		
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		
		try
		{
			int a = 9/0;
		}
		
		catch(NullPointerException e)
		{
			e.printStackTrace();
			System.out.println("An Exception occurred at division of integer a");
		}
		
		System.out.println("D");
		System.out.println("E");
		System.out.println("F");
	}

}
