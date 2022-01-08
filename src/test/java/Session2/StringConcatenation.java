package Session2;

public class StringConcatenation {
	
	public static void main(String[] args)
	{
		String x= "Test";
		String y= "Selenium";
		
		String a= "100";
		String b= "200";
		
		int i=100;
		int j=200;
		
		System.out.println(x);
		System.out.println("===============================");
		System.out.println(y);
		System.out.println("===============================");
		System.out.println(a+b);
		System.out.println("===============================");
		System.out.println(x+y);
		System.out.println("===============================");
		System.out.println(i+j);
		System.out.println("===============================");
		System.out.println(i+b);
		System.out.println("===============================");
		System.out.println(x+a);
		
		System.out.println("===============================");
		
		int bill=500;
		int tax=50;
		int total=bill+tax;
		System.out.println("The total bill is:" + total);
		System.out.println("The total bill is: "+ tax+bill);
		System.out.println("The total bill is: "+ (tax+bill));
		
		System.out.println("================Character Concatenation===============");
		char c1='A';
		char c2='B';
		int a1=100;
		int b1=200;
		String z1="A";
		String z2="B";
		
		System.out.println(c1+c2);
		System.out.println("===============================");
		System.out.println(c1+z1);
		System.out.println("===============================");
		System.out.println(a1+b1);
		System.out.println("===============================");
		System.out.println(z1+z2);
		System.out.println("===============================");
		System.out.println(z1+a1);
		System.out.println("===============================");
		System.out.println(c1+a1);
		
	}
	
		
}

