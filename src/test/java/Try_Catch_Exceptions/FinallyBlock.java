package Try_Catch_Exceptions;

public class FinallyBlock {
	
	public static void main(String[] args)
	{
		int a=10;
//		try
//		{
//			System.out.println("Division process");
//			int k=a/5;
//		}
//		catch (Exception e)
//		{
//			System.out.println("Some Exception occurred ");
//		}
		
		//==================================================================================
			
//		try
//		{
//			System.out.println("Division process");
//			int k=a/0;
//		}
//		
//		catch (Exception e)
//		{
//			e.printStackTrace();
//			System.out.println("Some Exception occurred ");
//		}
//		
//		//optional block
//		finally          //This block executed every time whether the Exception occurred or not
//		{
//			System.out.println("Processed");
//		}
		
		//==================================================================================
		
//		try
//		{
//			System.out.println("Division process");
//			int k=a/0;
//		}
//		
//		catch (NullPointerException e)
//		{
//			e.printStackTrace();
//			System.out.println("Some Exception occurred ");
//		}
//		
//		//optional block
//		finally          //This block executed every time whether the Exception occurred or not
//		{
//			System.out.println("Processed");
//		}
		
		//==================================================================================
		
		try
		{
			System.out.println("Division process");
			int k=a/0;
		}
		
		
		//optional block
		finally          //This block executed every time whether the Exception occurred or not
		{
			System.out.println("Processed");
		}
		
	}

}
