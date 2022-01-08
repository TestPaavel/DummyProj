package Overloading;

public class OverloadingMain {
	
	public static void main(String[] args)
	{
		System.out.println("Hi there");
		
		main(10);
		main(20,30);
	}

	public static void main(int a)
	{
		System.out.println(a);
	}
	
	public static void main(int a, int b)
	{
		System.out.println(a + b);
	}
}
