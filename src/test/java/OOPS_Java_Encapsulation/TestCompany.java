package OOPS_Java_Encapsulation;

public class TestCompany {
	
	public static void main(String[] args)
	{
		Company_1 c1= new Company_1();
		
		System.out.println(c1.name);
		System.out.println(c1.EmpCount);
		System.out.println(c1.logo);
		//System.out.println(c1.searchEngine);
		//System.out.println(c1.revenue);
		
		System.out.println("=============================================");
		
		c1.setName("Infinx");
		System.out.println("The company name is: ");
		System.out.println(c1.getName());
		
		System.out.println("=============================================");
		
		c1.setLogo("google.com");
		System.out.println("The company logo is: ");
		System.out.println(c1.getLogo());
		
		System.out.println("=============================================");
		
		c1.setempCount(1000);
		System.out.println("The company EmpCount is: ");
		System.out.println(c1.getempCount());
		
		System.out.println("=============================================");
		
		c1.setEngine("google");
		System.out.println("The company searchEngine is: ");
		System.out.println(c1.getsearchEngine());
		
		System.out.println("=============================================");
		
		c1.setrevenue(10000000);
		System.out.println("The company revenue is: ");
		System.out.println(c1.getrevenue());
		
		
		
	}

}
