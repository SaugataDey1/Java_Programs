package String_Playlist;

// Find if the Input String have all the unique characters in it

import java.util.HashMap;
import java.util.Map;

public class p2
{
    public static void main(String[] args)
    {
        String a = "abcdaef";

        Map<Character, Integer> map = new HashMap<>();

        int i = 0;
        while(i < a.length())
        {
            if(!map.containsKey(a.charAt(i)))
                map.put(a.charAt(i),1);
            else
                map.put(a.charAt(i), map.get(a.charAt(i))+1);

            i++;
        }

        for(Map.Entry<Character, Integer> data : map.entrySet())
        {
            if(data.getValue()==1)
                continue;
            else
            {
                System.out.println("Input String have a Duplicate Character of --> " + data.getKey() + ", which contains : " + data.getValue() + " no. of times");
                break;
            }
        }
    }
}
