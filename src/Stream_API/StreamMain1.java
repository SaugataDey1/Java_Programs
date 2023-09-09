package Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args)
    {
        //Q) Create a List and Filter all the Even Number from the List

        List<Integer> list1 = List.of(2, 4, 50, 21, 22, 67);

        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(34);
        list2.add(23);
        list2.add(78);

        List<Integer> list3 = Arrays.asList(23, 567, 12, 677, 24);

        // list1
        // without stream
        List<Integer> listEven = new ArrayList<>();

        for(Integer i : list1)
        {
            if(i%2==0)
                listEven.add(i);
        }

        System.out.println(list1);
        System.out.println(listEven);

        // Using Stream
        Stream<Integer> stream = list1.stream();
        List<Integer> newList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);

       // List<Integer> newList2 = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
       // System.out.println(newList2);




    }
}
