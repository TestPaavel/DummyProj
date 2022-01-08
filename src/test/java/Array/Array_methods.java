package Array;

public class Array_methods {
	
	public static void main(String[] args)
	{
		int i=10;
		i=20;
	     System.out.println(i);
	     
	     System.out.println("===============================");
	     
	     int z[]= {11,22,33,44,55,66,77};
	     
	     for(int count=0;count<=6;count++)
	     {
	     System.out.println(z[count]);
	     }
	     
	     System.out.println("===============================");
	     
	     int y[]= new int[6];
	     y[0]=10;
	     y[1]=20;
	     y[2]=30;
	     y[3]=40;
	     y[4]=50;
	     y[5]=60;
	     
	     for(int j=0;j<=5;j++)
	     {
	    	 System.out.println(y[j]);
	    	 System.out.println("===============================");
	    	 System.out.println(y[j] + 10);
	     }
	     
	     System.out.println("===============================");
	     
	     int test[]= new int[3];
	     test[0]=10;
	     test[1]=11;
	     test[2]=22;
	     
	     for(int q=0;q<=2;q++)
	     {
	    	 if(test[q]==22)
	    	 {
	    		 System.out.println("I found number 22");
	    	 }
	    	 else
	    	 {
	    		 System.out.println("Number 22 not found");
	    	 }
	     }
	     
	     System.out.println("======================================");
	     
	     double k1[]= new double[3];
	     k1[0]=55.67;
	     k1[1]=10.67;
	     k1[2]=12.89;
	    // k1[3]=12.89;
	     
	     //for(int j=0;j<k1.length;j++)
//	     for(int j=0;j<=2;j++)
//	     {
//	    	 System.out.println(k1[j]);
//	     }
	     
	     System.out.println(k1[2]);
	     
	     System.out.println("======================================");
	     
	     String b1[]= new String[3];
	     b1[0]= "Safari";
	     b1[1]= "Chrome";
	     b1[2]= "IE";
	     
	     for(int j=0;j<b1.length;j++)
	     {
	    	 System.out.println(b1[j]);
         }
	     
	     System.out.println("======================================");
	     
	     for(int j=0;j<b1.length;j++)
	     {
	    	 if(b1[j].equals("Chrome"))
	    		 {
	    		 System.out.println("Launching Chrome");
	    		 }
	     }
	     
	     System.out.println("======================================");
	     
	     for(int j=b1.length-1;j>=0;j--)
	     {
	    	 System.out.println(b1[j]);
         }
	     
	     System.out.println("======================================");
	     
	     Object emp[]= new Object[6];
	     emp[0]="Baban";
	     emp[1]=32;
	     emp[2]=15.25;
	     emp[3]='M';
	     emp[4]=true;
	     emp[5]="Mumbai";
	     
	     for(int j=0;j<emp.length;j++)
	     {
	    	 System.out.println(emp[j]);
	     }
	     
	     System.out.println("======================================");
	     
	     Object emp23[]= {"Baban",32,15.25,'M',true,"Mumbai"};
	     for(int j=0;j<emp23.length;j++)
	     {
	    	 System.out.println(emp23[j]);
	     }
	}
	
}
