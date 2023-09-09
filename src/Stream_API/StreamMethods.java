package Stream_API;

import java.util.List;
import java.util.stream.Collectors;

// Stream Methods -------------------------------------------------------
public class StreamMethods
{
    public static void main(String[] args)
    {
        //filter(Predicate)
             // Predicate -> Boolean value function

        //map(Function)
            // each element operation


        List<String> names = List.of("Aman", "Ankit", "Saugata", "Bob");
        List<String> newNames = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newNames);

        List<Integer> numbers = List.of(23, 4, 10, 13, 5, 20);
        List<Integer> squares = numbers.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(squares);

        names.stream().forEach(
                e -> {
                    System.out.println(e);
                }
        );

        newNames.stream().forEach(System.out::println);


        // Sorted
        numbers.stream().sorted().forEach(System.out::println);


        // min
        Integer minNumber = numbers.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println(minNumber);


        // max
        Integer maxNumber = numbers.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println(maxNumber);


    }
}
