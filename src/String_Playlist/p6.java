package String_Playlist;

// to remove the duplicate characters from a string

import java.util.HashMap;
import java.util.Map;

public class p6
{
    public static void main(String[] args)
    {
        String s = "abcdaefbghdijgymnea";

        Map<Character, Integer> map = new HashMap<>();

        int i=0;
        while(i<s.length())
        {
            if(!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), 1);
            else
                map.put(s.charAt(i), map.get(s.charAt(i))+1);

            i++;
        }

        String s2 = "";

        for(Map.Entry<Character, Integer> data : map.entrySet())
        {
            if(data.getValue() == 1)
                s2+=data.getKey();
            else
                continue;
        }

        System.out.println(s2);
    }
}
