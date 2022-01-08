package Session2;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str1="Hi everyone lets learn about Java";
      System.out.println("The length of a string is: "+ str1.length());
      
      int length= str1.length();
      System.out.println("The length is: "+ length);
      
      System.out.println("===============================");
      
      String str2="Hi everyone lets learn about StringManipulation in Java";
      System.out.println("The Character at 2nd index position is: "+ str2.charAt(1));
      
      System.out.println("===============================");
      
      String str3="Hi everyone lets learn about StringManipulation in Java";
      System.out.println("The index position is: "+ str3.indexOf('e'));
      System.out.println(str3.indexOf('e', 6));
      System.out.println(str3.indexOf('e'));
      System.out.println(str3.indexOf('e',str3.indexOf('e')+2));
      
      System.out.println("===============================");
      System.out.println(str3.indexOf("everyone"));
      
      System.out.println("===============================");
      System.out.println(str3.indexOf("StringManipulation"));
      int n= str3.indexOf("StringManipulation");
      if(n>-1)
      {
    	  System.out.println("Course is successfull");
      }
      else
      {
    	  System.out.println("Course is not valid");
      }
      
      System.out.println("===============================");
      //String str3="Hi everyone lets learn about StringManipulation in Java";
      System.out.println(str3.toUpperCase());
      System.out.println(str3.toLowerCase());
      
      System.out.println("===============================");
      
      String strA="   Hi everyone lets learn about Java       ";
      String removespaces=strA.trim();
      System.out.println(removespaces);
      System.out.println(strA.trim());
      
      System.out.println("===============================");
      
      String strB= "18/09/2021";
      System.out.println(strB.replace('/', '*'));
      
      System.out.println("===============================");
      
      String strC="Hi everyone lets learn about Java";
      System.out.println("The word Java is available: "  +strC.contains("Java"));
      
      if(strC.contains("apple"))
      {
    	  System.out.println("Yes The string or character is available");
      }
      else
      {
    	  System.out.println("No The string or character is not available"); 
      }
      
      System.out.println("===============================");
      
      String trans= "The transaction id is- 909867";
      System.out.println("The extracted transaction number is: " + trans.substring(23));
      
      System.out.println("===============================");
      String trans1= "The transaction id is- 909867 thank you";
      System.out.println("The extracted transaction number is: " + trans1.substring(23,29));
      
      System.out.println("===============================");
      
      String statement1= "Java is platform independent";
      String statement2= "java is platform independent";
      String statement3= "Java is platform independent";
      
      System.out.println("Check if statement1 is equal to statement3: " + statement1.equals(statement3));
      System.out.println("Check if statement1 is equal to statement2: " + statement1.equals(statement2));
      
      System.out.println("===============================");
      System.out.println("Check if statement1 is equal to statement2: " + statement1.equalsIgnoreCase(statement2));
      
      System.out.println("===============================");
      
      String[] a1= strA.split(" ");
      for(int i=0;i<a1.length;i++)
      {
    	 System.out.println(a1[i]);
      }
      
      System.out.println("===============================");
      
      String[] b1= strA.split(" ");
      for(int i=0;i<=3;i++)
      {
    	 System.out.println(b1[i]);
      }
      
      System.out.println("===============================");
      
      for(int i=a1.length-1;i>=0;i--)
      {
    	 System.out.println(a1[i]);
      }
      
      System.out.println("===============================");
      
      String c1= "Learn&Automation&Testing";
      String[] y1=c1.split("&");
      System.out.println(y1[1] + " " +y1[0]+" "+y1[2]);
      
      
      
	}

}
