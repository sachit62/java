class Mobile{
	String brand;
	int price;
	String network;
//	String name;
	static String name; // same for all object so static if obj1.name is changed every obj2,3,4,.. name will be changed 
	
	public void show() {
		System.out.println(brand+" : "+price+" : "+name);
	}
	
}

public class staticVariable {
	public static void main(String[] args) 
	{
		Mobile obj1=new Mobile();
		obj1.brand="Apple";
		obj1.price=1500;
		//obj1.name="SmartPhone";
		Mobile.name="SmartPhone";
		
		Mobile obj2=new Mobile();
		obj2.brand="Samsung";
		obj2.price=1700;
		//obj2.name="SmartPhone";
		Mobile.name="SmartPhone";
		
		//obj1.name="Phone";
		Mobile.name="SmartPhone";
		
		obj1.show();
		obj2.show();
		
		//System.out.println(obj1.brand);

	
	}
}