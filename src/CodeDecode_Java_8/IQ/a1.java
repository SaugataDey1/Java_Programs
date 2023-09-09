package CodeDecode_Java_8.IQ;

// duplicate integer from a String

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class a1
{
    public static void main(String[] args)
    {
        List<Integer> l = List.of(10,28,80,41,10,50,60,80,64,54,28,100);
        Set<Integer> set = new HashSet<>();
        l.stream().filter(i-> !set.add(i)).forEach(System.out::print);

    }
}
