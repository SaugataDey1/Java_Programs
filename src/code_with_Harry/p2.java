package code_with_Harry;

class MyThr extends Thread
{
    public MyThr(String name)
    {
        super(name);
    }
    public void run()
    {
        System.out.println("Thank You : ");
    }
}

class MyThr_2 implements Runnable
{

    /*
    public MyThr_2(String name)
    {
        super();
    }

     */
    public void run() {
        System.out.println("This Thread is Runnable...");
    }
}
public class p2
{
    public static void main(String[] args) {
         MyThr t1 = new MyThr("Harry");
         MyThr t2 = new MyThr("Ram");
         t1.start();
         t2.start();

         System.out.println("The ID of Thread t1 is : " + t1.getId());
         System.out.println("The ID of Thread t2 is : " + t2.getId());

         System.out.println("The name of Thread t1 is : " + t1.getName());
         System.out.println("The name of Thread t2 is : " + t2.getName());

         MyThr_2 t3 = new MyThr_2();
         Thread t4 = new Thread(t3,"Saugata");
         t4.start();
        System.out.println("T4 isAlive : " + t4.isAlive());
         System.out.println("The ID of Thread t4 is : " + t4.getId());
         System.out.println("The name of Thread t4 is : " + t4.getName());
        System.out.println("T4 is Daemon : " + t4.isDaemon());

        System.out.println("-------------------------------------------------------------");

        Thread t = new Thread();
        t.start();
        System.out.println("Thread t isAlive : " + t.isAlive());
        System.out.println("Current_Thread : " + Thread.currentThread().getName());
        System.out.println("Thread t1 is Alive or not : " + t1.isAlive());
        System.out.println("Thread t isAlive : " + t.isAlive());
        System.out.println("Thread t Name : " + t.getName());

    }
}
