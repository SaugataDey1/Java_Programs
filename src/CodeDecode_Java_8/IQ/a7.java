package CodeDecode_Java_8.IQ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class a7
{
    public static void main(String[] args)
    {
        // Average :
        List<Integer> l1 = List.of(1,5,7,4,5,6,40,10,56,100,95);
        IntSummaryStatistics summary = l1.stream().mapToInt(x->x).summaryStatistics();
        System.out.println("Average : " + summary.getAverage());

        // LowerCase to UpperCase :
        List<String> names = List.of("Rahul", "Saugat", "Disha", "Rahul", "Anjali", "Disha", "Shyam", "Kunal", "Lokesh");
        List<String> upper = names.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
        System.out.println(upper);

        // wap to fetch the common numbers from two arrays
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {4,5,6,7,8};
        List<Integer> common = Arrays.stream(array1).filter(a1 -> Arrays.stream(array2).anyMatch(a2 -> a2 == a1)).boxed().collect(Collectors.toList());
        System.out.println(common);

        // wap to calculate the sum of all even numbers in a list
        List<Integer> l2 = List.of(1,2,3,4,5,6,7,8,9,10,11,12);
        Integer sumOfEvens = l2.stream().filter(x -> x % 2 == 0).reduce((a, b) -> a + b).get();
        System.out.println("Sum of Evens : " + sumOfEvens);

        // Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
        List < String > colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
        List<String> descending = colors.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<String> ascending = colors.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted in Descending Order : " + descending);
        System.out.println("Sorted in Ascending Order : " + ascending);

        // Java program to find the maximum and minimum values in a list of integers using streams.
        Integer min = l2.stream().min((a, b) -> a.compareTo(b)).get();
        Integer max = l2.stream().max((a, b) -> a.compareTo(b)).get();
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);

        // Java program to find the second smallest and largest elements in a list of integers using streams.
        Stream<Integer> secondSmallest = l2.stream().sorted().skip(1).limit(1);
        secondSmallest.forEach(System.out::println);

        Stream<Integer> integerStream = l2.stream().map(i -> i * i);
        integerStream.forEach(System.out::println);

        /*
        Integer secondSmallest = l2.stream().sorted().skip(1).findFirst().orElse(null);
        Integer secondLargest = l2.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println("Second Smallest : " + secondSmallest);
        System.out.println("Second Largest : " + secondLargest);

        String
        list
        map
        */


    }
}
