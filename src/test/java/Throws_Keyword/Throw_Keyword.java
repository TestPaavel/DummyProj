package Throws_Keyword;

public class Throw_Keyword {
	
	//Throws_Keyword is used to create custom exception by user
	//as java has not included all kind of exception
	//and there will be some cases where user needs to create it own exception according to some specific condition
	
	public static void main(String[] args)
	{
		try
		{
			throw new Exception("User defined exception");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("An error occurred");
		}
		
		//use case
		//1. Reading data from any spreadsheet the cell value gets empty or null
		
//		String username="Baban";
//		if(username.equals(" ") || username.equals(null))
//		{
//			try
//			{
//				throw new Exception("User defined exception");
//			}
//			catch(Exception e)
//			{
//				e.printStackTrace();
//				System.out.println("Value fetched from spreadsheet can be blank or null");
//			}
//		}
//			
//			else
//			{
//				System.out.println("Needs some value");
//			}
		
		
		
		//2. Incorrect URL Exception
		
		//launchURL(" ");
		
//		public static void launchURL(String url)
//		{
//			if(url.equals(" "))
//			{
//				try
//				{
//					throw new Exception("Incorrect URL exception");
//				}
//				catch(Exception e)
//				{
//					e.printStackTrace();
//					System.out.println("The entered URL is incorrect");
//				}
//			}
//			else
//			{
//				System.out.println("Launching URL");
//			}
//		}
		
	}

}
