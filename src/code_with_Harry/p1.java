package code_with_Harry;

class MyThread1 extends Thread
{
    @Override
    public void run()
    {
        while(true)
        {
            System.out.println("My Thread_1 is Running");
            System.out.println("I am happy!");
        }
    }
}

class MyThread2 extends Thread
{
    @Override
    public void run()
    {
        while(true)
        {
            System.out.println("My Thread_2 is Running");
            System.out.println("I am sad!");
        }
    }
}

class MyThreadRunnable1 implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("My Thread Runnable 1");
    }
}

class MyThreadRunnable2 implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("My Thread Runnable 2");
    }
}

public class p1
{
    public static void main(String[] args)
    {
           MyThread1 t1 = new MyThread1();
           MyThread2 t2 = new MyThread2();

           t1.start();
           t2.start();

           MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
           Thread gun1 = new Thread(bullet1);

           MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
           Thread gun2 = new Thread(bullet2);

           gun1.start();
           gun2.start();


    }
}
