package CodeDecode_Java_8.IQ;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// wap in java 8 whether the number is Prime or not
// wap for square root of 10 prime numbers
public class a4
{
    public static void main(String[] args)
    {

        List<Double> sqrtOf10Prime = Stream.iterate(1, i->i+1)
                                     .filter(a4::isPrime)
                                     .map(Math::sqrt)
                                     .limit(10)
                                     .collect(Collectors.toList());



        /*
        List<Double> sqrtOf10Prime = IntStream.range(1, i->i+1).filter(a4::isPrime)
                .map(Math::sqrt)
                .collect(Collectors.toList());

         */

        System.out.println(sqrtOf10Prime);
    }

    public static boolean isPrime(int number)
    {
        return number>1 && IntStream.range(2,number).noneMatch(i -> number%i==0);
    }
}
