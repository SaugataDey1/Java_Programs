package String_Playlist;

// Find all Non-Repeated Characters in String

import java.util.HashMap;
import java.util.Map;

public class p3
{
    public static void main(String[] args)
    {
         String a = "ashufdgddra";

         Map<Character, Integer> map = new HashMap<>();

         int i = 0;
         while(i < a.length())
         {
             if(!map.containsKey(a.charAt(i)))
                 map.put(a.charAt(i), 1);
             else
                 map.put(a.charAt(i), a.charAt(i)+1);

             i++;
         }

         for(Map.Entry<Character, Integer> data : map.entrySet())
         {
             if(data.getValue() == 1)
                 System.out.print(data.getKey() + " ");
             else
                 continue;
         }
    }
}
