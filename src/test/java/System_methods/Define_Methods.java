package System_methods;

public class Define_Methods {
	
	//no input no return method
	
	public void test()
	{
		System.out.println("This is a test method");
	}
	
	//no input some return 
	
	public String nameofCountry()
		{
			String countryName="India";
			countryName.trim();
			//countryName.length();
			return countryName;
		
		}
		
		public String[] listofStudents()
		{
			//System.out.println("Student list- ");
			String names[]=new String[3];
			names[0]="person1";
			names[1]="person2";
			names[2]="person3";
			return names;
		}
		
		//some input some return
		
		public void addprintonly(int a,int b)
		{
			int c=a+b;
			System.out.println(c);
			
		}
		
		public int addreturnonly(int a,int b)
		{
			int c=a+b;
			return c;
			
		}
		
		public String FatoryName(String NameofFactory)
		{
			if(NameofFactory.equals("nike"))
			{
			String factory="@@@nike@@@";
			System.out.println("Hi this is nike factory");
			return factory;
			}
			
		   	else if (NameofFactory.equals("puma"))
			 {
				String factory1="@@@puma@@@";
				System.out.println("Hi this is puma factory");
				return factory1;
			 }
				
			return "no factory found on given criteria";
				
			}
		
		public String CountryCapital(String nameofCountry)
		{
			if(nameofCountry.equals("India"))
			{
				System.out.println("Delhi");
				return "Delhi";
			}
			
			else if(nameofCountry.equals("Canada"))
			{
				System.out.println("Ottawa");
				return "Ottawa";
			}
			
			
			{
				return "no country found";
			}
		}
		
		public static void main(String[] args)
		{
			Define_Methods refVariable= new Define_Methods();
			refVariable.test();
			String country=refVariable.nameofCountry();
			System.out.println(country+ " is a democratic country");
			
			System.out.println("===============================");
			
			String[] Student=refVariable.listofStudents();
			for(int i=0;i<Student.length;i++)
			{
				System.out.println(Student[i]);
			}
			System.out.println(refVariable.listofStudents()[2]);
			
//			for(int a=0;a<refVariable.listofStudents().length;a++)
//			{
//				System.out.println(refVariable.listofStudents()[a]);
//			}
			
			System.out.println("===============================");
			
			refVariable.addprintonly(10, 20);
			int total=refVariable.addreturnonly(10, 20);
			System.out.println(total+50);
			
			System.out.println("===============================");
			
			refVariable.FatoryName("nike");
			
		}
		
		
		
			
		
	}


