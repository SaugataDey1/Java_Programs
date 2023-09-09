public class Threading
{
    public static void main(String[] args) throws Exception
    {
        MyThread1 t1 = new MyThread1();
        /*
        Thread t1 = new Thread(new MyThread1());
        Thread t2 = new Thread(new MyThread2());
         */

        MyThread2 t2 = new MyThread2();

        t1.start();
        Thread.sleep(2000);

        // t2.start();

        MyThread_3 bullet1 = new MyThread_3("Saugat");
        Thread gun1 = new Thread(bullet1);
        gun1.start();

        try {
            gun1.join();
        }
        catch(Exception e){
            System.out.println(e.getLocalizedMessage());
        }

        gun1.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println("ID of the Thread_3 is " + gun1.getId());
        System.out.println("The state of the Thread 'gun1' is : " + gun1.getState());
        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getState());   // To get the Reference to the Current Thread in Java


    }
}

class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("I am Happy");
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        System.out.println("I am OK");
    }
}

class MyThread_3 implements Runnable{

    public MyThread_3(String name){
        super();
    }

    @Override
    public void run() {
        System.out.println("Using Thread by Implementing Runnable Interface");
    }
}
