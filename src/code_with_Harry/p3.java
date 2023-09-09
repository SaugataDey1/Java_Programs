package code_with_Harry;

public class p3
{
    static Thread mainThread;

    static class T1 extends Thread
    {

        public void run()
        {
            try
            {
                mainThread.join();
                for(int i=0; i<=5; i++)
                {
                    System.out.println("Thread T1 --> t1 @@@@@@@@@@@@@");
                    Thread.sleep(1000);
                }
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }

        }
    }

    static class T2 extends Thread
    {
        public void run()
        {
            for(int i=0; i<=5; i++)
            {
                System.out.println("Thread T2 --> t2 **************");
                try
                {
                    Thread.sleep(1000);
                } catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    static class T3 extends Thread
    {
        public void run()
        {
            for(int i=0; i<=5; i++)
            {
                System.out.println("Thread T3 --> t3 ####################");
                try
                {
                    Thread.sleep(1000);
                } catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
            }
        }
    }

        public static void main(String[] args) throws InterruptedException
        {

            p3.mainThread = Thread.currentThread();
           // mainThread.start();
           // mainThread.join();

            T1 t1 = new T1();
          //  t1.setDaemon(true);
            t1.start();
           // t1.join();

            for (int i=0; i<=5; i++)
            {
                System.out.println("Main Thread");
                Thread.sleep(1000);
            }

          //  t1.start();
            t1.join();

            T2 t2 = new T2();
            t2.start();
            t2.join();

            T3 t3 = new T3();
            t3.start();
            t3.join();

        }
}
