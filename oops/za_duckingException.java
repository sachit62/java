class NavinException extends Exception
{
    public NavinException(String message)
    {
        super(message);
    }
}

class A
{
    // Ducking exception using throws
    public void show() throws ClassNotFoundException
    {
        Class.forName("Calc");
    }
}

public class za_duckingException
{
    // Static block
    static
    {
        System.out.println("Class Loader");
    }

    public static void main(String[] args)
    {
        A obj = new A();

        try
        {
            obj.show();
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}