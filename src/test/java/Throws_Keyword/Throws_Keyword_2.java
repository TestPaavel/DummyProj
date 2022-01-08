package Throws_Keyword;

public class Throws_Keyword_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Throws_Keyword_2 ObjectRef= new Throws_Keyword_2();
		ObjectRef.launchBrowser();
	}


	
	public void launchBrowser()  
	{
		System.out.println("launchBrowser");
		try {
			launchURL();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("An error occurred");
		}
	}
	
	public void launchURL() throws Exception 
	{
		System.out.println("launchURL");
		login();
	}
	
	public void login() throws Exception
	{
		System.out.println("login");
		
		try
		{
		int a=9/0;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("An error occurred");
		}
	

	System.out.println("ABC");
	}


}
