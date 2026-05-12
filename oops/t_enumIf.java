enum Status
{
    Running, Failed, Pending, Success
}

public class t_enumIf
{
    public static void main(String[] args)
    {
        Status s = Status.Pending;

        if(s == Status.Running)
        {
            System.out.println("All good");
        }
        else if(s == Status.Failed)
        {
            System.out.println("Try again");
        }
        else if(s == Status.Pending)
        {
            System.out.println("Please wait");
        }
        else
        {
            System.out.println("Done");
        }
    }
}