
// Parent class
class Calc 
{
    // Parent class method
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
}

// Child class inheriting Calc
class AdvCalc extends Calc
{
    // Method Overriding
    // Same method name, same parameters, same return type
    @Override
    public int add(int n1, int n2)
    {
        // Changed implementation
        return n1 + n2 + 1;
    }
}

// Main class
public class h_methodOverriding
{
    public static void main(String args[])
    {
        // Creating object of child class
        AdvCalc obj = new AdvCalc();

        // Calling overridden method
        int r1 = obj.add(3, 4);

        // Printing result
        System.out.println("Result: " + r1);
    }
}