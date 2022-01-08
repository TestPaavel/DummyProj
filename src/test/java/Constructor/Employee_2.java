package Constructor;

public class Employee_2 {
	
	String name;
	int age;
	String dept;
	int empid;
	
	static String companyName="Infinx";
	
	//no return type
	//same as class name
	//construtor initialize by java and user defined and user defined has zero parameters and more than 1 parameters
	//if not provided by Java it provides internally
	//constructor can be overloaded
	
	public Employee_2()   //zero parameter constructor- User defined
	{
		System.out.println("User defined Zero parameter constructor");
	}
	
	public Employee_2(int i)  //One parameter constructor
	{
		System.out.println("One parameter constructor" + " " +i);
	}

	public Employee_2(String s)  //One parameter constructor
	{
		System.out.println("One parameter constructor" +" " + s);
	}
	
	//Create contructor all emp variables initialize
	
//	public Employee_2(String name1, int age1, String dept1, int empID1) 
//	{
//		name= name1;
//		age=age1;
//		dept=dept1;
//		empid=empID1;
//	}
		
		//or
		
		public Employee_2(String name, int age, String dept, int empid)
		{
			this.name=name;
			this.age=age;
			this.dept=dept;
			this.empid=empid;
		}
		
		
	
	
	//intialize only some emp
	
	public Employee_2(String name1, int empID1) 
	{
		name=name1;
		empid=empID1;
	}
	
	public static void main(String[] args)
	{
		Employee_2 e0= new Employee_2();
		
		System.out.println("===============================");
		
		Employee_2 e1= new Employee_2(10);
		Employee_2 e2= new Employee_2("Baban");
		
		System.out.println("===============================");
		
		Employee_2 e3= new Employee_2("Baban", 25, "HR", 1);
		Employee_2 e4= new Employee_2("Pinky", 25, "QA", 1);
		Employee_2 e5= new Employee_2("Tushar", 25, "Admin", 1);
		
		System.out.println("===============================");
		
		System.out.println(e3.name + " " + e3.age + " " + e3.dept + " " + e3.empid + " " + companyName);
		System.out.println(e4.name + " " + e4.age + " " + e4.dept + " " + e4.empid + " " + companyName);
		System.out.println(e5.name + " " + e5.age + " " + e5.dept + " " + e5.empid + " " + companyName);
		
		System.out.println("===============================");
		
		Employee_2 e6= new Employee_2("MAX", 110);
		System.out.println(e6.name + " " + e6.empid + " " + companyName);
		
		
		
	}
	
}
