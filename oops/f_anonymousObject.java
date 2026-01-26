
class A
{
    // Constructor → runs when object is created
    public A()
    {
        System.out.println("object created");
    }

    // Method of class A
    public void show()
    {
        System.out.println("in A show");
    }
}

public class f_anonymousObject
{
    public static void main(String a[])
    {
        // Normal variable
        int marks;
        marks = 99;

        // ---------------- ANONYMOUS OBJECT ----------------
        // Object is created but no reference variable is stored
        new A();            // constructor is called, object is lost after this line

        new A().show();     // anonymous object + method call
                            // object created → show() called → object destroyed

        // ---------------- NORMAL OBJECT ----------------
        // Object reference declared
        A obj;

        // Object created and assigned to reference variable
        obj = new A();      // constructor runs here

        // Method call using reference
        obj.show();
    }
}
