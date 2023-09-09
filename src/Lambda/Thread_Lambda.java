package Lambda;

// Wherever there is a Functional Interface we can use Lambda expression.
// Runnable is a Functional Interface.

public class Thread_Lambda
{
    public static void main(String[] args)
    {
        Runnable thread1 = () -> {
            for (int i=0; i<=10; i++)
            {
                System.out.println("Value of i is : " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t = new Thread(thread1);
        t.setName("JOHN");
        t.start();
    }
}
