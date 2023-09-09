//  Static Synchronization

public class Customer  // Bank has 1 Lock
{
    public static void main(String[] args)
    {
          Bank obj1 = new Bank(5000);  // obj has 1 Lock

          Thread t1 = new Thread(obj1);
          Thread t2 = new Thread(obj1);

          t1.setName("Raju");
          t2.setName("Sunita");

          Bank obj2 = new Bank(5000);

        Thread t3 = new Thread(obj2);
        Thread t4 = new Thread(obj2);

        t3.setName("Rahul");
        t4.setName("Anita");

        t1.start(); t2.start();
        t3.start(); t4.start();

    }
}

class Bank extends Thread
{
    static int bal = 5000;
    static int withdraw;
    Bank(int withdraw)
    {
        this.withdraw = withdraw;
    }

    public static synchronized void Withdraw()  // t1  t2  t3  t4
    {
        String name = Thread.currentThread().getName();

        if(withdraw <= bal)
        {
            System.out.println(name + " : withdraw money");
            bal=-withdraw;
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }

    @Override
    public void run() {
        Withdraw();
    }
}