package Self_Practise;

@FunctionalInterface
interface AnimalSound {
    void sound();
}

public class Lambda_1
{
    public static void main(String[] args) {
        AnimalSound a = () -> System.out.println("Dog is Barking");
        a.sound();

        Runnable t1 = ()->
        {
            for (int i=0; i<=10; i++)
            {
                System.out.println("i : " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        t1.run();
    }
}
