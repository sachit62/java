// Parent class
class A
{
    public void show()
    {
        System.out.println("in A show");
    }
}

// Child class B
class B extends A
{
    @Override
    public void show()
    {
        System.out.println("in B show");
    }
}

// Child class C
class C extends A
{
    @Override
    public void show()
    {
        System.out.println("in C show");
    }
}

// Unrelated class
class D
{
}

public class i_dynamicMethodDispatch
{
    public static void main(String[] args)
    {
        // Parent reference → Parent object
        A obj = new A();
        obj.show();

        // Parent reference → Child B object
        obj = new B();
        obj.show();

        // Parent reference → Child C object
        obj = new C();
        obj.show();

        // Not allowed because D is not child of A
        // obj = new D();   // Error
    }
}