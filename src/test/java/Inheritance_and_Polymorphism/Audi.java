package Inheritance_and_Polymorphism;

public class Audi extends Car{
	
	@Override
	public void Start()
	{
		System.out.println("Audi Start");
	}
	
	public void AutomaticGear()
	{
		System.out.println("Audi AutomaticGear");
	}

}
