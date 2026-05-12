enum Status
{
    Running, Failed, Pending, Success
}

public class s_enum
{
    public static void main(String[] args)
    {
        Status s = Status.Running;

        System.out.println(s);
    }
}