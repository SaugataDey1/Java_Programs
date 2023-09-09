// To Count the Frequency of Each Character in a String
import java.util.*;
import java.io.*;
public class p1 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();

        Map<Character, Integer> map = new HashMap<>();

        // To Enter Each Character into the Map.
        for(int i=0; i<s1.length(); i++)
        {
            if(!map.containsKey(s1.charAt(i)))
                map.put(s1.charAt(i), 1);
            else
                map.put(s1.charAt(i), map.get(s1.charAt(i)+1));
        }

        for(Map.Entry<Character, Integer> data : map.entrySet())
            System.out.println(data.getKey() + " : " + data.getValue());

    }
}
