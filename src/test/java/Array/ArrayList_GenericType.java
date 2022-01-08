package Array;

import java.util.ArrayList;

public class ArrayList_GenericType {
	
	public static void main(String[] args)
	{
		ArrayList ar=new ArrayList();
		
		System.out.println("Size of an ArrayList before starting somethisng is: " + ar.size());
		
		System.out.println("======================================");
		
//		ar.add(100);
//		ar.add(200);
//		ar.add(300);
//		
		ArrayList<String> ar1=new ArrayList<String>();
		
		ar1.add("Pinky");
		ar1.add("Baban");
		ar1.add("900");
		
		System.out.println(ar1.size());
		
		for (int i=0;i<ar1.size();i++)
		{
			System.out.println(ar1.get(i));
		}
		
		System.out.println("======================================");
		
        ArrayList<Integer> ar2=new ArrayList<Integer>();
		
		ar2.add(100);
		ar2.add(200);
		ar2.add(300);
		
		System.out.println(ar2.get(0));
		
		System.out.println("======================================");
		
		for (int i=0;i<ar2.size();i++)
		{
			System.out.println(ar2.get(i));
		}
		
		System.out.println("======================================");
		
		ArrayList<Object> ar9=new ArrayList<Object>();
		
		 ar9.add("Baban");
		 ar9.add(32);
		 ar9.add(15.25);
		 ar9.add('M');
		 ar9.add(true);
		 ar9.add("Mumbai");
		 
		 for (int i=0;i<ar9.size();i++)
			{
				System.out.println(ar9.get(i));
			}
	}

}
