package Durgesh.Stream;

// Filter the even numbers and then square that even numbers, collect that in another list and then print that list

import java.util.List;
import java.util.stream.Collectors;

public class p2
{
    public static void main(String[] args)
    {
        List<Integer> l1 = List.of(1,2,3,4,5,6,7,8,9,10);

        List<Integer> l2 = l1.stream().filter(i -> i % 2 == 0).map(e -> e * e).collect(Collectors.toList());

        System.out.println(l2);

        Integer minimum = l1.stream().min((n1,n2) -> n1.compareTo(n2)).get();
        System.out.println(minimum);

    }
}
