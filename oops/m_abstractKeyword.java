// Abstract class
abstract class A
{
    // Normal method (has implementation)
    public void show1()
    {
        System.out.println("in A show");
    }

    // Abstract method (no body)
    public abstract void show2();
}

// Child class must implement abstract method
class B extends A
{
    @Override
    public void show2()
    {
        System.out.println("in B show");
    }
}

public class m_abstractKeyword
{
    public static void main(String[] args)
    {
        // Not allowed
        // A obj = new A();

        // Abstract reference with child object
        A obj = new B();

        obj.show1();
        obj.show2();
    }
}