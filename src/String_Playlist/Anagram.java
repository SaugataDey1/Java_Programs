package String_Playlist;

// Two check whether the two Strings have same Character or not

import java.util.Arrays;

public class Anagram
{
    public static void main(String[] args)
    {
        String s1 = "HE Is aRAdhYA";
        String s2 = "is he HRADAYA";

        s1 = s1.replace(" ","");
        s2 = s2.replace(" ","");

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        Boolean result = Arrays.equals(a,b);

        if(result)
            System.out.println("Strings are Anagram");
        else
            System.out.println("Strings are not Anagram");

    }
}
