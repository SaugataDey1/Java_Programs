public class Block_Level_Synchronization
{
    public static void main(String[] args)
    {
          msg m = new msg();   // m has a lock
          ourThread t1 = new ourThread(m, "akhilesh");
          ourThread t2 = new ourThread(m, "ankush");
          t1.start();
          t2.start();
    }
}

class msg
{
    public void show(String name)
    {
        synchronized(this)
        {
            for(int i=0; i<=3; i++)
            {
                System.out.println("How are You" + name);
            }
        }
    }
}
class ourThread extends Thread{
    msg m;
    String name;
    ourThread(msg m, String name)
    {
        this.m = m;
        this.name = name;
    }
    public void run()
    {
        m.show(name);
    }
}
