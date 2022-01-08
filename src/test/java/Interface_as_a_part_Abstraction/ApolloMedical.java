package Interface_as_a_part_Abstraction;

public class ApolloMedical extends Global implements USMedical, UKMedical, IndianMedical{
	
	
	public void physioServices()
	{
		System.out.println("Apollo-----physio");
	}

	public void polioServices() {
		// TODO Auto-generated method stub
		System.out.println("Apollo-----polio");
	}

	public void peditricServices() {
		// TODO Auto-generated method stub
		System.out.println("Apollo-----peditric");
	}

	public void neuroServices() {
		// TODO Auto-generated method stub
		System.out.println("Apollo-----neuro");
	}


	public void ENTServices() {
		// TODO Auto-generated method stub
		System.out.println("Apollo-----ENTServices");
	}

	
	public void carServices() {
		// TODO Auto-generated method stub
		System.out.println("Apollo-----car");
	}

	
	public void RadiologyServices() {
		// TODO Auto-generated method stub
		System.out.println("Apollo-----Radiology");
	}

	
	public void oncologySerivices() {
		// TODO Auto-generated method stub
		System.out.println("Apollo-----oncology");
	}

	
	public void orthopedicSerivices() {
		// TODO Auto-generated method stub
		System.out.println("Apollo-----orthopedic");
	}

	
	public void RadiologySerivices() {
		// TODO Auto-generated method stub
		System.out.println("Apollo-----Radiology");
	}

	@Override
	public void intership()
	{
		System.out.println("Overriden Internship");
	}
}
