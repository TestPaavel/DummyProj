package Interface_as_a_part_Abstraction;

public interface IndianMedical extends Health_Organization {
	
	public void peditricServices();   //Abstract prototype method
	public void neuroServices();   //Abstract prototype method
	public void RadiologyServices();   //Abstract prototype method
	
	public static void otherServices()
	{
		System.out.println("Indian-----other Services");
	}

}
