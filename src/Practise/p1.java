package Practise;
// To count the Frequency of each word
import java.util.*;
import java.io.*;
public class p1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s=s.trim();
        String[] s1 = s.split(" ");
        int l = s1.length;

        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<l; i++)
        {
            if(!map.containsKey(s1[i]))
                map.put(s1[i], 1);
            else
                map.put(s1[i], (map.get(s1[i])+1));
        }

        for(Map.Entry<String, Integer> data : map.entrySet())
        {
            System.out.println(data.getKey() + " : " + data.getValue());
        }

    }
}
