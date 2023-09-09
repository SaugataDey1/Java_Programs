package Synchronization_Thread;

public class Synchronized_Demo
{
    static counter c = new counter();

    static class counter
    {
        int count;

        public synchronized void increment()
        {
            count++;
        }
    }

    public static void main(String[] args) throws InterruptedException
    {
         T1 t1 = new T1();
         T2 t2 = new T2();

         t1.start();
         t1.join();
         Thread.sleep(2000);

         t2.start();
         t2.join();
         Thread.sleep(2000);

        System.out.println("Count : " + c.count );

    }

    static class T1 extends Thread
    {
        public void run()
        {
            for(int i=0; i<5; i++)
            {
                c.increment();
            }
        }
    }

    static class T2 extends Thread
    {
        public void run()
        {
            for(int i=0; i<5; i++)
            {
                c.increment();
            }
        }
    }

}





