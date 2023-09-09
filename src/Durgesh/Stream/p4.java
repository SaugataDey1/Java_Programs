package Durgesh.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class p4
{
    public static void main(String[] args)
    {
        // To find the second smallest element in an Array
        int[] a = {10,8,1,5,2,3,14,22,62,20};

        // 1 way
        Arrays.stream(a).sorted().skip(1).limit(1).forEach(System.out::println);

        // 2 way
        int secondSmallestElement = Arrays.stream(a).sorted().skip(1).findFirst().orElseThrow(() -> new IllegalArgumentException());
        System.out.println(" secondSmallestElement : " + secondSmallestElement);

        // what if array having duplicates
        int elm = Arrays.stream(a).distinct().sorted().skip(1).findFirst().orElseThrow(() -> new IllegalArgumentException());
        System.out.println(" secondSmallestElement : " + elm);


        // wap to fetch the common numbers from two arrays
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {4,5,6,7,8};
        List<Integer> commonElements = Arrays.stream(array1).filter(arr1 -> Arrays.stream(array2).anyMatch(arr2 -> arr2 == arr1)).boxed().collect(Collectors.toList());
        // boxed() --> int to Integer
        System.out.println(commonElements);


        // wap to reverse an array of integers in-place --> without using another array
        int[] arr = {1,2,3,4,5};
        IntStream.range(0, arr.length/2).forEach(i -> {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        });
        System.out.println("Reversed Array : " + Arrays.toString(arr));


        // find the length of the longest string from the array of string
        String[] strings = {"Apple", "Banana", "Avacado", "Apricot", "Grapes"};
       // int maxLength = Arrays.stream(strings).mapToInt(string -> string.length()).max().orElse(0);
        int maxLength = Arrays.stream(strings).mapToInt(String::length).max().orElse(0);  // method referencing
        System.out.println("Length of Longest String : " + maxLength);

    }
}
