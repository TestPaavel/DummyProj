package Abstraction;

public class Test_Page_1 {
	
	//Page_1 abs= new Page_1();
	
	public static void main(String[] args)
	{
		System.out.println("=============================");
		
		Login_Page_1 lp= new Login_Page_1();
		lp.title();
		lp.url();
		lp.footerLinks();
		lp.logo();
		lp.privacypolicy();
		
		System.out.println("==============================================");
		
		Page_1 p= new Login_Page_1();
		p.title();
		p.logo();
		p.privacypolicy();
		
		System.out.println("==============================================");
		
		
	}

}
