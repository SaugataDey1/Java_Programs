package Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args)
    {
        // Stream API - Collection Process
        // collection / group of Object

        // To Create a Stream Interface Object --------------------

        /*
            // 1. Blank
            Stream<Object> emptyStream = Stream.empty();
            emptyStream.forEach(e -> System.out.println(e));
        */

        // 2. Array, Object, Collection
        String names[] = {"Durgesh", "Uttam", "Ankit", "Divya"};

        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e -> System.out.println(e));

        // 3. Builder
        Stream<Object> StreamBuilder = Stream.builder().build();

        //4.
        IntStream intStream = Arrays.stream(new int[]{2, 4, 65, 3,});
        intStream.forEach(e -> System.out.println(e));

        // 5. List, Set
        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(34);
        list2.add(23);
        list2.add(78);

        Stream<Integer> stream2 = list2.stream();
        stream2.forEach(e -> System.out.println(e));

    }
}
