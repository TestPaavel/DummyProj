package Interface_as_a_part_Abstraction;

public interface USMedical extends Health_Organization 

{
	int min_fee=10;  //by default variable is static or final
	
	public void physioServices();     //Abstract prototype method
	public void oncologySerivices();   //Abstract prototype method
	public void orthopedicSerivices();   //Abstract prototype method
	public void RadiologySerivices();   //Abstract prototype method(Common services also available in other interfaces)
	
	//cannot create the object of interfaces
	//only method declaration--- method prototype--- no method body---Abstract method
	//cannot create static Abstract prototype method in interface---because we cannot override static methods
	//Example
	//public static void testServices();
	//interface variables are static and final by default
	
	public static void Services_911()
	{
		System.out.println("US-------911 Services");
	}
	
	default void intership()
	{
		System.out.println("US-----Intership");
	}

}
