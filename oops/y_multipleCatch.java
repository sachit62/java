public class y_multipleCatch
{
    public static void main(String[] args)
    {
        int nums[] = {10, 20, 30};
        String str = null;

        try
        {
            System.out.println(nums[5]);
            System.out.println(str.length());
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index is invalid");
        }
        catch(NullPointerException e)
        {
            System.out.println("Null object access");
        }
        catch(Exception e)
        {
            System.out.println("Some other exception");
        }
    }
}