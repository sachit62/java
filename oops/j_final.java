// final keyword with variable, method, and class

class Calc
{
    // Final method
    public final void show()
    {
        System.out.println("By Navin");
    }

    // Normal method
    public void add(int a, int b)
    {
        System.out.println(a + b);
    }
}

// Child class
class AdvCalc extends Calc
{
    // This is NOT allowed because show() is final
    /*
    public void show()
    {
        System.out.println("By John");
    }
    */
}

public class j_final
{
    public static void main(String[] args)
    {
        // ---------------- FINAL VARIABLE ----------------

        final int num = 8;

        // Not allowed
        // num = 9;   // Error

        System.out.println("Final variable: " + num);

        // ---------------- FINAL METHOD ----------------

        AdvCalc obj = new AdvCalc();

        // Parent final method
        obj.show();

        // Normal inherited method
        obj.add(4, 5);
    }
}