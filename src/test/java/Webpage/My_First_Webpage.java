package Webpage;

public class My_First_Webpage {
	
	//public static void main(String[] args)
	
		String title="Amazon";
		String url="https://www.amazon.in";
		String header="Amazon.in : mobile";
		
		String ImageLogo="https://m.media-amazon.com/images/I/61CnyJ-IbML._AC_UY218_.jpg";
		
		//Non static method
		
		public void topPannel()
		{
			System.out.println("-----------------Top Pannel Start-------------------------");
			System.out.println(url);
			System.out.println("This is the Paanel of the application");
			System.out.println(ImageLogo);
			System.out.println("-----------------Top Pannel End-------------------------");
		}
		
		public void centrePannel()
		{
			System.out.println("-----------------Centre Pannel Start-------------------------");
			System.out.println("Mobile");
			System.out.println("Laptop");
			System.out.println("Books");
			System.out.println("-----------------Centre Pannel End-------------------------");
		}
		
		public void footerPannel()
		{
			System.out.println("-----------------Footer Pannel Start-------------------------");
			System.out.println("Links-1");
			System.out.println("Links-2");
			System.out.println("Links-3");
			System.out.println("-----------------Footer Pannel End-------------------------");
		}
		
		public static void helpSection()
		{
			System.out.println("-----------------helpSection Start-------------------------");
			System.out.println("About the application");
			System.out.println("Locations");
			System.out.println("Privacy Note");
			System.out.println("-----------------helpSection End-------------------------");
		}
		
		public static void main(String[] args)
		{
			My_First_Webpage sc=new My_First_Webpage();
			sc.topPannel();
			sc.centrePannel();
			sc.footerPannel();
			//sc.helpSection();
			helpSection();
		}
	

}
