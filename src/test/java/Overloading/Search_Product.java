package Overloading;

public class Search_Product {
	
	public void search(String productName)
	{
		System.out.println("Search by->" + productName);
	}
	
	public void search(String productName, int price)
	{
		System.out.println("Search by->" + productName + " " + price);
	}
	
	public void search(String productName,int price, String sellerName)
	{
		System.out.println("Search by->" + price + " " + sellerName);
	}
	
	public void PAYMENT(long CCNumber)
	{
		System.out.println("PAYMENT BY CREDIT CARD Number: "+ CCNumber);
	}
	
	public void payment(long CCNumber, int price)
	{
		System.out.println("PAYMENT BY CREDIT CARD Number: "+ CCNumber + " " + price);
	}
	
	public void payment(long CCNumber, int price, String CardPersonName)
	{
		System.out.println("PAYMENT BY CREDIT CARD Number: "+ CCNumber + " " + price + " " + CardPersonName);
	}
	
	public static void main(String[] args)
	{
		Search_Product searchProd=new Search_Product();
		searchProd.search("Dress");
		searchProd.search("Dress", 750);
		searchProd.search("Bottle", 500, "Milton");
		
		System.out.println("===================================================");
		
		Search_Product makePayment=new Search_Product();
		makePayment.PAYMENT(1110909878);
		makePayment.payment(1110909878, 980);
		makePayment.payment(1110909878, 980, "Baban");
	}

}
