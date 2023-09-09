package CodeDecode_Java_8;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateBiFunctionDemo
{
    public static void main(String[] args)
    {
        BiPredicate<Integer, Integer> checkSumOfTwo = (a,b) -> a+b >= 5;
        System.out.println("sum of 2 and 5 is greater than 5 : " + checkSumOfTwo.test(2,5));
        System.out.println("sum of 2 and 1 is greater than 5 : " + checkSumOfTwo.test(2,1));

        BiFunction<Integer, Integer, Integer> multiplyBoth = (a,b) -> a*b;
        System.out.println("multiplication of 5 and 10 is : " + multiplyBoth.apply(5, 10));

        BiConsumer<Integer, Integer> sumBoth = (a,b) -> System.out.println("sum of both number is : " + (a+b));
        sumBoth.accept(5, 10);
    }
}
