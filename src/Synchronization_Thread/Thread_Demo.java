package Synchronization_Thread;

class Counter
{
    int count;

    public synchronized void increment()
    //public void increment()
    // When we don't make our Method Synchronized then our Method is not Thread safe
    // We make our Method Synchronized then only one Thread can access the Method and after it end
    // another Thread can access that Method.
    {
        count++;
    }
}
public class Thread_Demo
{
    public static void main(String[] args) throws Exception
    {

        Counter c = new Counter();

        Thread t1 = new Thread(new Runnable()
        {
            public void run()
            {
                for(int i=1; i<=1000; i++)
                {
                    c.increment();
                }
            }
        }

        );

        Thread t2 = new Thread(new Runnable()
        {
            public void run()
            {
                for(int i=1; i<=1000; i++)
                {
                    c.increment();
                }
            }
        }

        );

        t1.start();
        t1.join();
        t2.start();

        //t1.join();
        t2.join();

        System.out.println("Count: " + c.count);

    }

}
