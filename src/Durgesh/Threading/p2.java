package Durgesh.Threading;
// Thread : T1, T2, T3
// Main Thread --> T1 --> T2 --> T3

public class p2
{
    static Thread main_thread;

    static class T1 extends Thread
    {
        @Override
        public void run()
        {

            try {
                main_thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            for (int i=0; i<5; i++)
            {
                System.out.println("Thread T1 --------------------------");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    static class T2 extends Thread
    {
        @Override
        public void run() {
            for (int i=0; i<5; i++)
            {
                System.out.println("Thread T2 ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    static class T3 extends Thread
    {
        @Override
        public void run() {
            for (int i=0; i<5; i++)
            {
                System.out.println("Thread T3 --------------------------");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException
    {
        p1.T1 t1 = new p1.T1();
        p1.T2 t2 = new p1.T2();
        p1.T3 t3 = new p1.T3();

      //  t1.start();

        main_thread = Thread.currentThread();

        for(int i=0; i<5; i++)
        {
            System.out.println("Main Thread");
            Thread.sleep(1000);
        }

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();
    }
}
