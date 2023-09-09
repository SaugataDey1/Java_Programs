package Self_Practise;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Optional_1
{
    public static void main(String[] args) throws NoSuchElementException
    {
        String str_1 = "Java is a Programming Language";
        String str_2 = null;
        Optional<String> op_1 = Optional.ofNullable(str_1);
        Optional<String> op_2 = Optional.ofNullable(str_2);

        System.out.println(op_1.get());
        System.out.println(op_1.orElse("Optional_1 is NULL  -------------> 1"));
        System.out.println(op_1.isPresent());


      //  System.out.println(op_2.get());
        System.out.println(op_2.isPresent());
        System.out.println(op_2.orElse("Optional_2 is NULL  --------------->2"));



    }





}
