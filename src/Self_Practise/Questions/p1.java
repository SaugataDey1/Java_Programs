package Self_Practise.Questions;

/*
    Java 8 program to count Strings whose length is greater than 3 in List -->
     Input : ("java", "php", angular, python, R, C++)
 */

import java.util.List;
import java.util.Random;

public class p1 {
    public static void main(String[] args)
    {
        List<String> list = List.of("java", "php", "angular", "python", "R", "C++");
        long count = list.stream().filter(e->e.length()>3).count();
        System.out.println(count);

        Random randomNumber = new Random();
    /*    int number = randomNumber.nextInt(100,300);
        System.out.println(number);

     */
        randomNumber.ints(100,300).distinct().sorted().limit(10).forEach(System.out::println);


    }
}
