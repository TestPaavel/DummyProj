package Constructor;

public class Employee_1 {
	
	String name;
	int age;
	String dept;
	int empid;
	
	static String companyName="Infinx";
	
	public static void main(String[] args)
	{
		Employee_1 e1= new Employee_1();
		e1.name="Pinky";
		e1.age=25;
		e1.dept="QA";
		e1.empid=1;
		
		Employee_1 e2= new Employee_1();
		e2.name="Tushar";
		e2.age=25;
		e2.dept="HR";
		e2.empid=2;
		
		System.out.println("Employee 1 info------------");
		System.out.println("Name:"+ e1.name);
		System.out.println("Age:"+ e1.age);
		System.out.println("Department:"+ e1.dept);
		System.out.println("EmaployeeId:"+ e1.empid);
		System.out.println("CompanyName:"+ companyName);
		
		System.out.println("Employee 2 info------------");
		System.out.println("Name:"+ e2.name);
		System.out.println("Age:"+ e2.age);
		System.out.println("Department:"+ e2.dept);
		System.out.println("EmaployeeId:"+ e2.empid);
		System.out.println("CompanyName:"+ companyName);
	}

}
