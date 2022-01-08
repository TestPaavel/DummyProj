package Try_Catch_Exceptions;

public class Final_Keyword_2 {
	
	public static void main(String[] args)
	{
		int p=getNumber();
		System.out.println(p);
	}

//	public static int getNumber() {
//		// TODO Auto-generated method stub
//		
//		int a=10;
//		//int b=5;
//		int b=0;
//		
//		try
//		{
//			int c= a/b;
//			return c;
//		}
//		
//		catch (Exception e)
//		{
//			return -1;
//		}
//		
//		finally
//		{
//			System.out.println("ok");
//		}
	
//	public static int getNumber() {
//		// TODO Auto-generated method stub
//		
//		int a=10;
//		int b=20;
//		
//		
//		try
//		{
//			int c= a+b;
//			return c;
//		}
//		
//		catch (Exception e)
//		{
//			return -1;
//		}
//		
//		finally
//		{
//			System.out.println("ok");
//			return 100; //by this return key the actual return number is overriden so do not use return in finally
//			            //otherwise it will change the actualreturn of the method
//		}
	
	public static int getNumber() {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=0;
		
		
		try
		{
			int c= a/b;
			return c;
		}
		
		catch (NullPointerException e)
		{
			return -1;
		}
		
		finally
		{
			System.out.println("ok");
			//return 100; //by this return key the actual return number is overriden so do not use return in finally
			            //otherwise it will change the actualreturn of the method
		}
		
	}

}
