package Durgesh.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class p1
{
    public static void main(String[] args)
    {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(a).map(e->e*e).forEach(i-> System.out.print(i + " "));

        System.out.println();

        List<Integer> l1 = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> l2 = l1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(l2 + " ");

        Integer max = l1.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println(max);

        System.out.println();

        String[] s = {"Saugata", "Anjali", "Shiv", "Durgesh", "Ankit", "Baishaki"};
        Arrays.stream(s).filter(e->e.startsWith("A")).forEach(System.out::print);




    }
}
