package Exception_handling;

public class Try_Catch_3 {
	
	static int x= 9;
	static int y=0;
	
	public static void main(String[] args)
	{
		Try_Catch_3 a1= new Try_Catch_3();
		a1.division(x,y);
	}
	
	public void division(int a, int b)
	{
		try
		{
			int c= a/b;
			System.out.println("The division of input " + a + " and " + b + " is -> " + c);
			try
			{
				System.out.println("code");
			}
			
			catch(Exception e)
			{
				
			}
		}
		
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("An Exception occurred inside division method");
		}
		
		catch(NullPointerException e)
		{
			e.printStackTrace();
			System.out.println("An Exception occurred other than NullPointerException inside division method");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("An Exception occurred other than ArithmeticException inside division method");
		}
	}

}
