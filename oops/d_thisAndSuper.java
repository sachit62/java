// Parent class
class A
{
    int num = 1;

    // Default constructor of A
    public A()
    {
        super(); // calls Object class constructor
        System.out.println("in A default constructor");
    }

    // Parameterized constructor of A
    public A(int n)
    {
        super(); // calls Object class constructor
        System.out.println("in A parameterized constructor");
    }

    // Method in parent class
    public void show()
    {
        System.out.println("show in A");
    }
}

// Child class
class B extends A
{
    int num = 2; // same variable name as in parent

    // Default constructor of B
    public B()
    {
        super(); // calls A() constructor
        System.out.println("in B default constructor");
    }

    // Parameterized constructor of B
    public B(int n)
    {
        this();  // calls B() constructor (same class)
        System.out.println("in B parameterized constructor");
    }

    // Overridden method
    public void show()
    {
        System.out.println("show in B");
    }

    // Method demonstrating this & super
    public int getValue()
    {
        int num = 3; // local variable

        this.show();      // calls B's show()
        super.show();     // calls A's show()

        System.out.println("local num : " + num);
        System.out.println("this.num  : " + this.num);   // B's num
        System.out.println("super.num : " + super.num);  // A's num

        return super.num; // returning parent variable
    }
}

// Main class
public class d_thisAndSuper
{
    public static void main(String[] args)
    {
        // Object creation using parameterized constructor
        B obj = new B(5);

        System.out.println("Returned value : " + obj.getValue());
    }
}
