@FunctionalInterface
interface A
{
    void show();

    // If this is added, error occurs
    // void run();
}

public class w_functionalINterface
{
    public static void main(String[] args)
    {
        // Anonymous implementation of functional interface
        A obj = new A()
        {
            @Override
            public void show()
            {
                System.out.println("in Show");
            }
        };

        obj.show();
    }
}