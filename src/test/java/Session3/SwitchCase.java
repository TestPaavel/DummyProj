package Session3;

public class SwitchCase {
	
	public static void main(String[] args)
	{
		int n=1;
		if(n==5)
		{
			System.out.println("Number is Five");
		}
		else if(n==0)
		{
			System.out.println("Number is Zero");
		}
		else
		{
			System.out.println("Number is from Zero to Nine");
		}
		
		System.out.println("===============================");
		
		switch (n)
		{
			case 0:
			System.out.println("Number Zero");
			break;
			
			case 1:
				System.out.println("Number One");
				break;
				
			case 2:
				System.out.println("Number Two");
				break;
				
			case 3:
				System.out.println("Number Three");
				break;
				
			case 4:
				System.out.println("Number Four");
				break;
				
			case 5:
				System.out.println("Number Five");
				break;
				
				default:
					System.out.println("Enter number from Zero to Five");
		}
		
		System.out.println("===============================");
		
		char alphabet= '1';
		switch (alphabet)
		{
			case 'A':
			System.out.println("Alphabet A");
			break;
			
			case 'B':
				System.out.println("Alphabet B");
				break;
				
			case 'C':
				System.out.println("Alphabet C");
				break;
				
			default:
				System.out.println("Enter Alphabets from A to Z");
		}
	}

}
