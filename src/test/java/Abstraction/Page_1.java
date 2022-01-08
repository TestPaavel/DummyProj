package Abstraction;

public abstract class Page_1 {
	
	//QUES: can abstract class be final
	//ans: no, a class can be either abstract or final not both
	
	public Page_1()
	{
		System.out.println("Page constant");
	 
	}
	
	public abstract void title();
	public abstract void url();
	public abstract void footerLinks();
	
	public void logo()
	{
		System.out.println("Page logo");
	}
	
	public final void privacypolicy()
	{
		System.out.println("Page- Privacy policy");
	}

}
