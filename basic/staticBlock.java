class Mobile{
	String brand;
	int price;
	String network;
	static String name;
	
	public Mobile() {
		brand="";
		price=200;
//		name="Phone";
		System.out.println("in constructor");
	}
	
	public void show() {
		System.out.println(brand+" : "+price+" : "+name);
	}

	static {
		name="Phone";
		System.out.println("in static block");
	}
	
	
}

public class staticBlock {
	public static void main(String[] args) throws ClassNotFoundException
	{
		
		// Class.forName("Mobile");  // default class by java to show static block is executed
		
		Mobile obj1=new Mobile();
		obj1.brand="Apple";
		obj1.price=1500;
		Mobile.name="SmartPhone";   // class loads(static block called) then objects are instantiated
		
		Mobile obj2=new Mobile();

	
	}
}