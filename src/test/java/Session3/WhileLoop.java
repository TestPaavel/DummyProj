package Session3;

public class WhileLoop {
	
	public static void main(String[] args)
	{
		int i= 1;
		while(i<=10)
		{
			System.out.println(i);
			++i;
		}
		
		System.out.println("==================================");
		
		int j=0;
		while(j<=10)
		{
			System.out.println(j);
			
			if(j==5)
			{
				System.out.println("The number is 5");
				break;
			}
			j++;
			
		}
		System.out.println("==================================");
		
		for(int a=0;a<=10;a++)
		{
			System.out.println(a);
		}
		System.out.println("==================================");
		
		for(int b=10;b>=0;b--)
		{
			System.out.println(b);
			if(b==3)
			{
				System.out.println("The number is 3");
				break;
			}
			//System.out.println(b);
		}
		System.out.println("==================================");
		
		int m=10;
		do
		{
			m++;
			System.out.println(m);
		}
		while(m<=10);
	}

}
