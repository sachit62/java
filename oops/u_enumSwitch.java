enum Status
{
    Running, Failed, Pending, Success
}

public class u_enumSwitch
{
    public static void main(String[] args)
    {
        Status s = Status.Failed;

        switch(s)
        {
            case Running:
                System.out.println("All good");
                break;

            case Failed:
                System.out.println("Try again");
                break;

            case Pending:
                System.out.println("Please wait");
                break;

            case Success:
                System.out.println("Completed");
                break;
        }
    }
}