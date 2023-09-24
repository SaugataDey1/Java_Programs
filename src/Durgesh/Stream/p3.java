package Durgesh.Stream;

// Min, Max, Avg, Sum --> Java 8
// Getting 2 and 3 element smallest number
// Duplicate and UniqueNames Names from a String

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class p3
{
    public static void main(String[] args)
    {
        List<Integer> l1 = List.of(1,5,7,4,5,6,40,10,56,100,95);
        IntSummaryStatistics summary = l1.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("Max : " + summary.getMax());
        System.out.println("Min : " + summary.getMin());
        System.out.println("Avg : " + summary.getAverage());
        System.out.println("Sum : " + summary.getSum());

        // Getting 2 and 3 element smallest number
        List<Integer> l2 = l1.stream().map(i -> i).sorted().skip(1).limit(2).collect(Collectors.toList());
        System.out.println(l2);

        // Duplicate & UniqueNames Names from a String
        List<String> names = List.of("Rahul", "Saugat", "Disha", "Rahul", "Anjali", "Disha", "Shyam", "Kunal", "Lokesh");
        names.stream().distinct().forEach(x -> System.out.print(x + "  "));

        System.out.println();

        // 1 way
        Set<String> uniqueNames = new HashSet<>();
        Set<String> duplicateNames = names.stream().filter(name -> !uniqueNames.add(name)).collect(Collectors.toSet());
        System.out.println("DuplicateNames : " + duplicateNames);
        System.out.println("UniqueNames : " + uniqueNames);

        // 2 way
        Map<String, Long> mapOfNames = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Set<String> duplicate_Names = mapOfNames.entrySet().stream().filter(entry -> entry.getValue() > 1).map(entry -> entry.getKey()).collect(Collectors.toSet());
        System.out.println("DuplicateNames : " + duplicate_Names);

        // 3 way
        Set<String> duplicates = names.stream().filter(name -> Collections.frequency(names, name) > 1).collect(Collectors.toSet());
        System.out.println("Duplicate Names : " + duplicates);

    }
}
