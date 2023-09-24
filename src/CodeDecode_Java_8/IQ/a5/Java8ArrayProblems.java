package CodeDecode_Java_8.IQ.a5;

import java.util.Arrays;
import java.util.OptionalInt;

public class Java8ArrayProblems
{
    public static void main(String[] args)
    {
        int[] numbers = {5,2,8,3,1,1};
        fetchSecondSmallest(numbers);
    }

    public static void fetchSecondSmallest(int[] arr)
    {
        int secondSmallestElement = Arrays.stream(arr).distinct().sorted().skip(1).findFirst().orElseThrow(() -> new IllegalArgumentException("Array doesnot contain second element"));
        System.out.println("Second smallest Element in given Array is : " + secondSmallestElement);
    }
}
