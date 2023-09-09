package Lambda;

import java.util.function.BiConsumer;

@FunctionalInterface
interface DemoApp
{
    void meth1();
}

class Test
{
    public static void testImplementation()
    {
        System.out.println("This is Test Implementation of your Abstract Method");
    }
}

public class Lambda {
    public static void main(String[] args)
    {
        DemoApp d = ()-> System.out.println("showing Lambda.Lambda");
        d.meth1();

        // BiConsumer
        BiConsumer<Integer, Integer> biConsumer = (a,b) -> System.out.println(a+b);
        biConsumer.accept(5, 10);

        // Method Reference in Java 8
        DemoApp d2 = Test :: testImplementation;
        d2.meth1();
    }
}
