//private: inside class only                     Protected: inside class, package, outside package by subclass only(extends)
//Default: inside the class, package             Public: inside class, package, outside package by subclass only(extends), outside package

package AccessModifiers;

public class Company_1 {
	
	//Private
	private int revenue=50000;
	
	//Protected
	protected String ceoName="Baban";
	
	//Default
	String companyBranchName="Infinx";
	
	//Public
	public int employeeCount=300;
	
	public static void main(String[] args)
	{
		Company_1 C1= new Company_1();
		System.out.println("Company Revenue is: " + C1.revenue);
		System.out.println("Company ceoName is: " + C1.ceoName);
		System.out.println("Company companyBranchName is: " + C1.companyBranchName);
		System.out.println("Company employeeCount is: " + C1.employeeCount);
	}
}