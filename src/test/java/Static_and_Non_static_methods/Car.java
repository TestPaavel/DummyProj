package Static_and_Non_static_methods;

public class Car {
	
	String name;
	int price;
	String colour;
	
	static int Break=2;
	
	public static void main(String[] args)
	{
		Car sportscar=new Car();
		sportscar.name="Audi";
		sportscar.price=5000;
		sportscar.colour="Black";
		Car.Break=3;
		
		System.out.println(sportscar.name);
		System.out.println(sportscar.price);
		System.out.println(sportscar.colour);
		System.out.println(Break);
		
		System.out.println("===================================================");
		
		Car sports=new Car();
		sports.name="KIA";
		sports.price=5000;
		sports.colour="Black";
		
		System.out.println(sports.name);
		System.out.println(sports.price);
		System.out.println(sports.colour);
		System.out.println(Break);
		
	}
	

}
