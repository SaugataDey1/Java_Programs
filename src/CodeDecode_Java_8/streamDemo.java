package CodeDecode_Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamDemo
{
    public static void main(String[] args)
    {
        List<String> names = List.of("Sachi", "Maya", "Rahul", "Disha", "Anu", "Joy", "Yash");
        System.out.println(names);
        names.stream().sorted((n1,n2) -> n1.compareTo(n2)).forEach(name -> System.out.print(name + "  "));

        System.out.println();

        Stream.of(1,11,111,1111,11111).forEach(x -> System.out.print(x + " "));

        System.out.println();

        String[] name = {"Code", "Decode", "Demos"};
        Stream.of(name).filter(x -> x.length() > 4).forEach(x -> System.out.print(x));

        List<Integer> intList = Arrays.asList(1,2,3,4,5,6);
        System.out.println(intList.stream().filter(a -> a%2 == 0).peek(System.out::println).map(a -> a+a).filter(a -> a>5).count());

        // summing all the value of intList
        System.out.println(intList.stream().reduce((a,b) -> a+b).get());

        // Intermediate Short - Circuit operation --> limit()
        intList.stream().limit(3).collect(Collectors.toList()).forEach(System.out::print);

        System.out.println();

        // Terminal Short - Circuit operation
        Integer firstEvenNumber = intList.stream().filter(i -> i % 2 == 0).findFirst().get();
        System.out.println("FirstEvenNumber : " + firstEvenNumber);

        // findAny()
        Integer even_1 = intList.stream().filter(i -> i % 2 == 0).findAny().get();
        System.out.println("Even 1 : " + even_1);

        Integer even_2 = intList.stream().parallel().filter(i -> i % 2 == 0).findAny().get();
        System.out.println("Even 2 : " + even_2);

        // anyMatch() equivalent to OR operation
        boolean isEvenPresent = intList.stream().anyMatch(i -> i % 2 == 0);
        System.out.println("isEvenPresent : " + isEvenPresent);

        // allMatch() equivalent to AND operation
        boolean allIsEven = intList.stream().allMatch(i -> i % 2 == 0);
        System.out.println("All Is Even : " + allIsEven);

        // noneMatch() --> if first true then return false
        boolean NoneIsEven = intList.stream().noneMatch(i -> i % 2 == 0);
        System.out.println("None Is Even : " + NoneIsEven);

    }
}
