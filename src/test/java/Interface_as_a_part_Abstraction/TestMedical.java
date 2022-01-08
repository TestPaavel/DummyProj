package Interface_as_a_part_Abstraction;

public class TestMedical {
	
	public static void main(String[] args)
	{
		ApolloMedical ap= new ApolloMedical();
		ap.carServices();
		ap.ENTServices();
		ap.oncologySerivices();
		ap.neuroServices();
		ap.GlobalDataHistory();
		
		System.out.println(ap.min_fee);
		System.out.println(USMedical.min_fee);
		USMedical.Services_911();
		ap.intership();
	}

}
