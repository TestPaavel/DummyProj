package Static_and_Non_static_methods;

public class Static_and_Non_static {
	
	//Variables
	String name;
	static int age=25;
	
	//method
	public void getName()
	{
		System.out.println("get name");
	}
	
	public static void getStart()
	{
		System.out.println("get start");
	}

	
	public static void main(String[] args) 
	{
		//to call static method and variables
		System.out.println("===================================================");
		getStart();
		System.out.println(age);
		System.out.println("===================================================");
		
		Static_and_Non_static.getStart();
		System.out.println(Static_and_Non_static.age);
		System.out.println("===================================================");
		
		Static_and_Non_static object=new Static_and_Non_static();
		object.getStart();
		System.out.println(object.age);
		System.out.println("===================================================");
		
		
		//to call non- static method and variables
		Static_and_Non_static object1=new Static_and_Non_static();
		object1.getName();
		object1.name="Baban";
		System.out.println(object1.name);
		System.out.println("===================================================");
		
		new Static_and_Non_static().getStart();
		System.out.println(new Static_and_Non_static().age);
		new Static_and_Non_static().getName();
		System.out.println(new Static_and_Non_static().name="Baban");
		
		System.out.println("===================================================");
		
		Static_and_Non_static object2=new Static_and_Non_static();
		object2.getName();
		object2=null;
		//object2.getName();
		
	}
}
