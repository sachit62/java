class A
{
    int age;

    // Outer class method
    public void show()
    {
        System.out.println("in show");
    }

    // Static Inner Class (Nested Class)
    static class B
    {
        public void config()
        {
            System.out.println("in config");
        }
    }
}

public class n_innerClass
{
    public static void main(String[] args)
    {
        // Object of outer class
        A obj = new A();
        obj.show();

        // Object of static inner class
        A.B obj1 = new A.B();
        obj1.config();
    }
}