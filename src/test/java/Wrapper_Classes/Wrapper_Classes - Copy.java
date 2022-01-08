package Wrapper_Classes;

public class Wrapper_Classes {
	
	public static void main(String[] args)
	{
		//String to integer
		System.out.println("String to Integer");
		String a="100";
		System.out.println(a+10);
		
		System.out.println("======================================");
		
		String a1="100";
		int b=10;
		System.out.println(a1+b);
		
		System.out.println("======================================");
		
		String price="750";
		int charge=50;
		System.out.println(price+charge);
		
		System.out.println("======================================");
		
		int value= Integer.parseInt(price);
		System.out.println(value+charge);
		
		System.out.println("======================================");
		
		//Integer to string
		
		System.out.println("100"+10);	
		System.out.println(100+10);
		int vat=100;
		System.out.println(vat+10);
		
		System.out.println("======================================");
		
		String value1=String.valueOf(vat);
		System.out.println(value1+10);
		
		System.out.println("======================================");
		
		//String to double
		
		String memorysize="8.2";
		System.out.println(memorysize+8);
		
		System.out.println("======================================");
		
		
		Double total=Double.parseDouble(memorysize);
		System.out.println(total+8);
		
		String mobileprice="$300";
		String total3=mobileprice.substring(1); //it counts from index 1 position 300
		System.out.println(total3);
		int total1=Integer.parseInt(total3);
		System.out.println(total1+50);
	}

}
