class Laptop
{
    String model;
    int price;

    // Overriding toString() method from Object class
    @Override
    public String toString()
    {
        return model + " : " + price;
    }

    // Custom equals() method
    public boolean equals(Laptop that)
    {
        return this.model.equals(that.model) && this.price == that.price;
    }
}

public class k_objectClass
{
    public static void main(String[] args)
    {
        // First object
        Laptop obj = new Laptop();
        obj.model = "Lenovo Yoga";
        obj.price = 1000;

        // Second object
        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo Yoga";
        obj2.price = 1000;

        // Comparing objects
        boolean result = obj.equals(obj2);

        System.out.println("Equal? " + result);

        // Calling toString()
        System.out.println(obj.toString());

        // Same as above because println automatically calls toString()
        System.out.println(obj);
    }
}