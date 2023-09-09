package CodeDecode_Java_8;

import java.util.function.Consumer;

public class ConsumerDemo
{
    public static void main(String[] args)
    {
        Consumer<Integer> squareMe = i -> System.out.println("Taking an input and performing operation and return nothing " + i * i);
        squareMe.accept(5);

        Consumer<Integer> DoubleMe = i -> System.out.println("Taking an input and performing operation and return nothing " + 2 * i);
        DoubleMe.accept(5);

        // Consumer Chaining
        squareMe.andThen(DoubleMe).accept(5);
    }
}
