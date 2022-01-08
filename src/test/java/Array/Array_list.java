package Array;

import java.util.ArrayList;

public class Array_list {

	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		System.out.println(a1.size());
		
		System.out.println("======================================");
		
		a1.add(100);
		a1.add(200);
		a1.add("test");
		
		System.out.println("After adding some values in ArrayList size is: " + a1.size());
		
		System.out.println("======================================");
		
		a1.add(500);
		a1.add(600);
		
		System.out.println("After adding some values in ArrayList size is: " + a1.size());
		
		System.out.println("======================================");
		
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		
		System.out.println("======================================");
		
		System.out.println("The value for 2nd index position is: " + a1.get(2));
		
		System.out.println("======================================");
		
		ArrayList ar1=new ArrayList();
		
		ar1.add(100);
		ar1.add(200);
		ar1.add("test");
		ar1.add(500);
		ar1.add(600);   //remove one array
		ar1.add(800);
		
		System.out.println("After adding some values in ArrayList size is: " + ar1.size());
		
		for(int i=0;i<ar1.size();i++)
		{
			System.out.println(ar1.get(i));
		}
		
		ar1.remove(1);
		
		System.out.println("======================================");
		
		System.out.println("After adding some values in ArrayList size is: " + ar1.size());
		
		for(int i=0;i<ar1.size();i++)
		{
			System.out.println(ar1.get(i));
		}
		
		System.out.println("======================================");
		
//		ar1.clear();
//		
//        System.out.println("After adding some values in ArrayList size is: " + ar1.size());
//		
//		for(int i=0;i<ar1.size();i++)
//		{
//			System.out.println(ar1.get(i));
//		}
		
		ar1.add(5, 900);
		
		System.out.println("After adding some values in ArrayList size is: " + ar1.size());
		
		for(int i=0;i<ar1.size();i++)
		{
			System.out.println(ar1.get(i));
		}
		
		System.out.println("======================================");
		
		System.out.println(ar1.contains(900));
		boolean value=ar1.contains(900);
		System.out.println(value);
		
		System.out.println("======================================");
		
		System.out.println(ar1.isEmpty());

	}

}
