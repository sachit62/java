interface A
{
    int age = 44;
    String area = "Mumbai";

    void show();
    void config();
}

class B implements A
{
    public void show()
    {
        System.out.println("in show");
    }

    public void config()
    {
        System.out.println("in config");
    }
}

public class q_interface
{
    public static void main(String[] args)
    {
        A obj;
        obj = new B();

        obj.show();
        obj.config();

        System.out.println(A.area);
    }
}