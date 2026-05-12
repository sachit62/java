public class x_exceptionHandling
{
    public static void main(String[] args)
    {
        int i = 10;
        int j = 0;

        try
        {
            // risky code
            int result = i / j;

            System.out.println(result);
        }
        catch(ArithmeticException e)
        {
            // handling exception
            System.out.println("Cannot divide by zero");
        }
        finally
        {
            // always executes
            System.out.println("Program ended");
        }
    }
}