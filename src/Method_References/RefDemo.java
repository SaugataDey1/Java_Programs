package Method_References;

public class RefDemo {
    public static void main(String[] args)
    {
        // Static Method ko refer kiya
        // ClassName::methodName
        WorkInter workInter = Stuff::doStuff;
        workInter.doTask();

        Runnable runnable = Stuff::threadTask;

        Thread d = new Thread(runnable);
        d.start();


        // Referring Non-Static Method
        // ObjectName::methodName
        Stuff ob = new Stuff();
        Runnable runnable1 = ob::printNumber;

        Thread d1 = new Thread(runnable1);
        d1.start();

    }
}
