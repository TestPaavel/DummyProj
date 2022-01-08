package Session3;

public class Comparison_Operator {
	
	public static void main(String[] args)
	{
		int a=100;
		int b=200;
		
		if(a>b)
		{
			System.out.println("A is greater than B");
		}
		else
		{
			System.out.println("B is greater than a");
		}
		System.out.println("===============================");
		
		if(a>b)
		{
			System.out.println("A is greater than B");
		}
		else if(b>a)
		{
			System.out.println("B is greater than A");
		}
		else
		{
			System.out.println("A and B are equal");
		}
		
		System.out.println("===============================");
		
		int total=100;
		if(!(total==0))
		{
			System.out.println("Give him 10 rupees discount");
		}
		else
		{
			System.out.println("No discount");
		}
		
		System.out.println("===============================");
		
		int q=10;
		if(q==5)
		{
			System.out.println("Q is having value equal to 5");
		}
		else
		{
			System.out.println("Q is not having value equal to 5");
		}
		
		System.out.println("===============================");
		
		int e=50;
		if(e>10)
		{
			if(e==15)
			{
				System.out.println("e is equal to 15");
			}
			if(e==20)
			{
				System.out.println("e is equal to 20");
			}
			else
			{
			System.out.println("e is not equal to 15 and 20");
			}
		}
		else
		{
			System.out.println("condition not satisfied");
		}
		
		System.out.println("===============================");
		
		int x=100;
		int y=200;
		int z=300;
		
		if(x>y && x>z)
		{
			System.out.println("x is greater");
		}
		else if(y>z)
		{
			System.out.println("y is greater");
		}
		else
		{
			System.out.println("z is greater");
		}
		
		System.out.println("===============================");
		
		String username="Pinky";
		if(username=="Tom" || username=="Baban")
		{
			System.out.println("Hi Developer");
		}
		if(username=="Pinky" || username=="Tushar")
		{
			System.out.println("Hi QA Engineer");
		}
		else
		{
			System.out.println("Another field");
		}
		
		System.out.println("===============================");
		
		int c1=10;
		if(false)
		{
			System.out.println("A1");
		}
		else
		{
			System.out.println("B1");
		}
	}

}
