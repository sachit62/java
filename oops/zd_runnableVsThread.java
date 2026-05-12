public class zd_runnableVsThread
{
    public static void main(String[] args)
    {
        // Runnable task 1 using lambda
        Runnable obj1 = () ->
        {
            for(int i = 1; i <= 5; i++)
            {
                System.out.println("Hi");

                try
                {
                    Thread.sleep(10);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };

        // Runnable task 2 using lambda
        Runnable obj2 = () ->
        {
            for(int i = 1; i <= 5; i++)
            {
                System.out.println("Hello");

                try
                {
                    Thread.sleep(10);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };

        // Assign tasks to thread objects
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        // Start threads
        t1.start();
        t2.start();
    }
}