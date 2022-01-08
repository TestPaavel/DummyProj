package Session2;

public class IncrementAndDecrementOperator {
	
	public static void main(String[] args)
	{
		int a=1;
		a= a+1;
		
		System.out.println(a);
		
		System.out.println("===============Post Increment=====================");
		int i=1;
		int j=i++;
		
		System.out.println(i);
		System.out.println(j);
		
		System.out.println("===============Pre Increment=====================");
		int c=1;
		int d=++c;
		
		System.out.println(c);
		System.out.println(d+1);
		
		System.out.println("===============Pre Decrement=====================");
		int m=1;
		int n=--m;
		
		System.out.println(m);
		System.out.println(n);
		
		System.out.println("===============Post Decrement=====================");
		int x=1;
		int y=x--;
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("==================================");
		int x1=-1;
		int y1=x1--;
		
		System.out.println(x1);
		System.out.println(y1);
		
		System.out.println("====================================");
		int m1=-1;
		int n1=--m1;
		
		System.out.println(m1);
		System.out.println(n1);
	}

}
