package String_Playlist;

// To put all the characters of a String to Map data Structure

import java.util.HashMap;
import java.util.Map;

public class p1
{
    public static void main(String[] args)
    {
        String name = "Saugata Dey";
        char[] c = name.toCharArray();

        Map<Character,Integer> map = new HashMap<>();

        int i=0;
        while (i<c.length)
        {
            if(!map.containsKey(c[i]))
                map.put(c[i],1);
            else
                map.put(c[i],(map.get(c[i])+1));

            i++;
        }

        // for accessing the Map data
        for(Map.Entry<Character,Integer> data : map.entrySet())
        {
            System.out.println(data.getKey() + " : " + data.getValue());
        }

    }
}
