package String_Playlist;

// To print the Duplicate Characters in a String

import java.util.HashMap;
import java.util.Map;

public class p5
{
    public static void main(String[] args)
    {
        String s = "abcdafghbyxnf";

        Map<Character, Integer> map = new HashMap<>();

        int i = 0;
        while(i<s.length())
        {
            if(!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),1);
            else
                map.put(s.charAt(i), map.get(s.charAt(i))+1);

            i++;
        }

        for(Map.Entry<Character, Integer> data : map.entrySet())
        {
            if(data.getValue() > 1)
                System.out.println(data.getKey() + " : " + data.getValue());
            else
                continue;
        }

    }
}
