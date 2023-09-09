package Self_Practise.Stream;

// Create a List and filter all the Even no.

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream_1
{
    public static void main(String[] args)
    {
        List<Integer> list1 = List.of(2, 4, 50, 89, 100, 64, 38, 6, 20, 21, 91);
        Stream<Integer> stream = list1.stream();

        List<Integer> list2 = stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(list2);

        List<String> names = List.of("Saugata", "Anil", "Rahul", "Shivam", "Rony", "Keshav", "Rohit");
        List<String> names2 = names.stream().filter(e->e.startsWith("R")).collect(Collectors.toList());
        names2.forEach(e-> System.out.println("New Names : " + e));

        List<Integer> numbers = List.of(2,4,3,5,9,6);
        List<Integer> squares = numbers.stream().map(i->i*i).collect(Collectors.toList());
        squares.stream().forEach(e-> System.out.println("Squares" + e));

        // Sorted
        squares.stream().sorted().forEach(System.out::println);

        // Min
        Integer min = numbers.stream().min((x,y)->x.compareTo(y)).get();

        // Max
        Integer max = numbers.stream().max((x,y)->x.compareTo(y)).get();







    }

}
