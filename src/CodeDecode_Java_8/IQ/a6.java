package CodeDecode_Java_8.IQ;

// to sort number which is greater than 5 and also even number

import java.util.List;

public class a6
{
    public static void main(String[] args)
    {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        list.stream().filter(x -> (x%2==0 && x>5)).forEach(System.out::print);
    }
}
