class A
{
    public void show1()
    {
        System.out.println("in A show");
    }
}

class B extends A
{
    public void show2()
    {
        System.out.println("in B show");
    }
}

public class l_upDownCasting
{
    public static void main(String[] args)
    {
        // ---------------- UPCASTING ----------------

        // Parent reference holding child object
        A obj = new B();

        // Parent class method accessible
        obj.show1();

        // ---------------- DOWNCASTING ----------------

        // Converting parent reference back to child reference
        B obj1 = (B) obj;

        // Child class method accessible
        obj1.show2();
    }
}