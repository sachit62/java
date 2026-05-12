class A
{
    public void show()
    {
        System.out.println("in A show");
    }
}

public class o_anonymousInnerClass
{
    public static void main(String[] args)
    {
        // Anonymous inner class object
        A obj = new A()
        {
            @Override
            public void show()
            {
                System.out.println("in new show");
            }
        };

        obj.show();
    }
}