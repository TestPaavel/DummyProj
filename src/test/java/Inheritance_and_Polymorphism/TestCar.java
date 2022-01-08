package Inheritance_and_Polymorphism;

public class TestCar {
	
	public static void main(String[] args)
	{
		System.out.println("Print the statement");

		Audi A1= new Audi();
		A1.Start();    //Override
		A1.Stop();     //extends
		A1.AutomaticGear();     //Class Audi
		A1.Engine();    //class vehicle
		
		
		System.out.println("=============================================");
		
		Car C1= new Audi();
		C1.Start();
		C1.Stop();
		C1.Petrol();
		C1.Engine();
		//C1.AutomaticGear();
		
		System.out.println("=============================================");
		
		Car C2= new Car();
		C2.Start();
		C2.Stop();
		C2.Petrol();
		C2.Engine();
		
		System.out.println("=============================================");
		
		Vehicle V1= new Audi();
		V1.Engine();
		
		System.out.println("=============================================");
		
		//Audi A3= new Car();    //Error- Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		//Type mismatch: cannot convert from Car to Audi
		
		//Audi A3= (Audi) new Car();     Exception in thread "main" java.lang.ClassCastException: class Inheritance_and_Polymorphism.Car cannot be cast to class Inheritance_and_Polymorphism.Audi (Inheritance_and_Polymorphism.Car and Inheritance_and_Polymorphism.Audi are in unnamed module of loader 'app')
		//at Inheritance_and_Polymorphism.TestCar.main(TestCar.java:43)
	}

}
