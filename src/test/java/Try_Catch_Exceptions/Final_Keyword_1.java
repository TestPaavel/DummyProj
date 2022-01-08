package Try_Catch_Exceptions;


 class Parent
 {
	 public void test()
	 {
		 System.out.println("Hi this ia a method in Parent class");
	 }
	 
//	 final public void test()
//	 {
//		 System.out.println("Hi this ia a method in Parent class");                              error gets display to remove the final as it cannot override
//	 }     
	 
 }
 
 
 
 public class Final_Keyword_1 extends Parent
 {
	 @Override
	 public void test()
	 {
		 System.out.println("Hi this ia a method in Child class");
	 }
	 
	 public static void main(String[] args)
	 {
		 Final_Keyword_1 ch= new Final_Keyword_1();
		 ch.test();
	 }
 }

