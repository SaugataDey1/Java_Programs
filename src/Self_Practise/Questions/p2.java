package Self_Practise.Questions;

// add two integer using Lambda
// Find all number starts with 1 using Java 8 features
// print the unique common Number from two arrays

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class p2
{
    public static void main(String[] args)
    {
      /*  add value = (int a, int b) ->System.out.println(a+b);
        value.sum(5,4); */

     /*   List<Integer> list = Arrays.asList(10, 13, 17, 56, 95, 11);
        List<String> newList = list.stream().map(s->s+"").filter(e->e.startsWith("1")).collect(Collectors.toList());
        System.out.println(newList); */

        int[] a = {1,2,3,3,1};
        int[] b = {3,3};
        /*    int commonNumber=0;
            List<Integer> l = new ArrayList<>();

            for(int i=0; i<a.length; i++)
            {
                for(int j=0; j<b.length; j++)
                {
                    if(a[i]==b[j] & a[i]!=commonNumber)
                    {
                        commonNumber=a[i];
                        l.add(commonNumber);
                        System.out.println(l);
                    }
                }
             }     */

        Arrays.stream(a).filter(x->Arrays.stream(b).anyMatch(y->y==x)).distinct().forEach(System.out::println);


    }
}
