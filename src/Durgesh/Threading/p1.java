package Durgesh.Threading;
// Thread T1, T2, T3
// T1 --> T2 --> T3

public class p1
{
    static class T1 extends Thread
    {
        @Override
        public void run() {
            for (int i =0; i<5; i++)
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
            for (int i =0; i<5; i++)
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
            for (int i =0; i<5; i++)
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
        T1 t1 = new T1();
        T2 t2 = new T2();
        T3 t3 = new T3();

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();
    }
}
