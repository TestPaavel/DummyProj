package Abstraction;

public class Login_Page_1 extends Page_1{
	
	public Login_Page_1()
	{
		System.out.println("Login page count");
	}
	
	@Override
	public void title()
	{
		System.out.println("Login page title");
	}
	
	@Override
	public void url()
	{
		System.out.println("https://google.com");
	}
	
	@Override
	public void footerLinks()
	{
		System.out.println("footerLinks");
	}
	
	@Override
	public void logo()
	{
		System.out.println("Login Page-> Logo");
	}
	
//	@Override
//	public void privacypolicy()
//	{
//		
//	}

}
