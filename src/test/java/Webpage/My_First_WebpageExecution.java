package Webpage;

public class My_First_WebpageExecution {
	
	public static void main(String[] args)
	{
		My_First_Webpage sc1= new My_First_Webpage();
		sc1.centrePannel();
		sc1.topPannel();
		sc1.footerPannel();
		My_First_Webpage.helpSection();
		
		System.out.println("Title is: " + sc1.title);
	}

}
