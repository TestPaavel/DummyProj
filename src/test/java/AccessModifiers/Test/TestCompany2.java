package AccessModifiers.Test;

import AccessModifiers.Company_1;

public class TestCompany2 extends Company_1{
	
		//protected
		public String changeceoName()
		{
			ceoName="Pinky";
			return ceoName;
		}
		
		//default
//		public void changeCompanyBranch()
//		{
//			companyBranchName="Infinx";
//		}
		
		//private
//		public void changerevenueofcompany()
//		{
//			revenue=10000;
//		}
		
		//public
		public int changeemployeecountofcompany()
		{
			employeeCount=250;
			return employeeCount;
		}
		
		public static void main(String[] args)
		{
			TestCompany2 c1= new TestCompany2();
			System.out.println("The changed ceo Name is: " + c1.changeceoName());
			System.out.println("The change count is: " + c1.changeemployeecountofcompany());
		}
	}

	
