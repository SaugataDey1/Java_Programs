// DeadLock in MultiThreading
public class DeadLockDemo
{
    public static void main(String[] args)
    {
        final String r1 = "R1";
        final String r2 = "R2";

        Thread t1 = new Thread()
        {
            @Override
            public void run()
            {
                synchronized (r1)
                {
                    System.out.println("Thread 1 acquired lock on R1");

                    try { Thread.sleep(1000); }
                    catch (Exception e){ System.out.println(e); }

                    synchronized (r2)
                    {
                        System.out.println("Thread 1 acquired lock on R2");
                    }
                }
            }
        };

        Thread t2 = new Thread()
        {
            @Override
            public void run()
            {
                synchronized (r2)
                {
                    System.out.println("Thread 2 acquired lock on R2");

                    try { Thread.sleep(1000); }
                    catch (Exception e){ System.out.println(e); }

                    synchronized (r1)
                    {
                        System.out.println("Thread 2 acquired lock on R1");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}
