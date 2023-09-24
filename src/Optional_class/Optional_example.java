package Optional_class;

import java.util.Optional;

// Basically Optional Class is to Handle NULL value.

public class Optional_example
{
    public static void main(String[] args)
    {
        /*
            String str = null;
            if(str==null)
            {
                System.out.println("this is null object");
            }
            else {
                System.out.println(str.length());
            }
         */

        String str = "Java is my favourite language";
      //  String str = "";

        Optional<String> optional = Optional.ofNullable(str);

        System.out.println(optional.isPresent());
        System.out.println(optional.get());
     //   System.out.println(optional);

        System.out.println(optional.orElse("No value in this Object"));
       // optional.orElseGet();

    }
}
