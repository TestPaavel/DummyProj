package Exception_handling;

public class Try_Catch {
	
	public static void main(String[] args)
	{
//	      System.out.println("A");
//	      System.out.println("B");
//	      System.out.println("C");
//	      
//	      int a = 9/0;        //Exception in thread "main" java.lang.ArithmeticException: / by zero
//	                                 	//at Exception_handling.Try_Catch.main(Try_Catch.java:11)
//	      
//	      System.out.println("D");
//	      System.out.println("E");
//	      System.out.println("F");
	
	
	
//		System.out.println("A");
//		System.out.println("B");
//		System.out.println("C");
//		
//		try 
//		{
//			int a =9/0;
//		}
//		
//		catch(Exception e)
//		{
//			
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
		
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("An Exception occurred at division of integer a");
		}
		
		System.out.println("D");
		System.out.println("E");
		System.out.println("F");
		
		
	}

}
