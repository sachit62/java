abstract class A
{
    // Abstract methods
    public abstract void show();
    public abstract void config();
}

public class p_abstractandAnonymousInnerClass
{
    public static void main(String[] args)
    {
        // Anonymous class implementing abstract class methods
        A obj = new A()
        {
            @Override
            public void show()
            {
                System.out.println("in new show");
            }

            @Override
            public void config()
            {
                System.out.println("in config");
            }
        };

        obj.show();
        obj.config();
    }
}