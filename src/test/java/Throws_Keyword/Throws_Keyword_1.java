package Throws_Keyword;

public class Throws_Keyword_1 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		 
//		Throws_Keyword_1 ObjectRef= new Throws_Keyword_1();
//		ObjectRef.launchBrowser();
//
//	}
//	
//	public void launchBrowser()
//	{
//		System.out.println("launchBrowser");
//		launchURL();
//	}
//	
//	public void launchURL()
//	{
//		System.out.println("launchURL");
//		login();
//	}
//	
//	public void login()
//	{
//		System.out.println("login");
//		int a=9/0;
//	}
	
	//output
//	launchBrowser
//	launchURL
//	login
//	Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at Throws_Keyword.Throws_Keyword_1.login(Throws_Keyword_1.java:28)
//	at Throws_Keyword.Throws_Keyword_1.launchURL(Throws_Keyword_1.java:22)
//	at Throws_Keyword.Throws_Keyword_1.launchBrowser(Throws_Keyword_1.java:16)
//	at Throws_Keyword.Throws_Keyword_1.main(Throws_Keyword_1.java:9)
	
	//==============================================================================================
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 
		Throws_Keyword_1 ObjectRef= new Throws_Keyword_1();
		ObjectRef.launchBrowser();

	}
	
	public void launchBrowser() throws Exception
	{
		System.out.println("launchBrowser");
		launchURL();
	}
	
	public void launchURL() throws Exception
	{
		System.out.println("launchURL");
		login();
	}
	
	public void login() throws Exception
	{
		System.out.println("login");
		int a=9/0;
	}
	
	//output
	
//	launchBrowser
//	launchURL
//	login
//	Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at Throws_Keyword.Throws_Keyword_1.login(Throws_Keyword_1.java:66)
//		at Throws_Keyword.Throws_Keyword_1.launchURL(Throws_Keyword_1.java:60)
//		at Throws_Keyword.Throws_Keyword_1.launchBrowser(Throws_Keyword_1.java:54)
//		at Throws_Keyword.Throws_Keyword_1.main(Throws_Keyword_1.java:47)

}
