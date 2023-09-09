package CodeDecode_Java_8.IQ;

// calculate the frequency of each word in a string using java 8

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class a3
{
    public static void main(String[] args)
    {
         String str = "welcome to code decode and code decode welcome you";
         List<String> l = Arrays.asList(str.split(" "));

         Map<String, Long> map = l.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
      //   Map<String, Long> map = l.stream().collect(Collectors.groupingBy(x -> x,Collectors.counting()));
         System.out.println(map);
    }
}
