package String_Playlist;

// Find Max. occuring character in a String

import java.util.HashMap;
import java.util.Map;

public class p4
{
    public static void main(String[] args) 
    {
         String s = "abcdgghaaaabyxa";

        Map<Character, Integer> map = new HashMap<>();
        
        int i = 0;
        while(i < s.length())
        {
            if(!map.containsKey(s.charAt(i)))
               map.put(s.charAt(i), 1);
            else 
               map.put(s.charAt(i), map.get(s.charAt(i))+1);
            
            i++;
        }
        
        int max = 0;
        Character c = null;
        
        for(Map.Entry<Character, Integer> data : map.entrySet())
        {
            if(data.getValue() > max)
            {
                max = data.getValue();
                c = data.getKey();
            }
            else continue;
        }

        System.out.println("Character with Max frequency : " + c + " with " + max + " no. of times.");
        
    }
}
