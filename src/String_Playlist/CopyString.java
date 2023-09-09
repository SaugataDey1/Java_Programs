package String_Playlist;

// To copy String from one String to another String
// Reverse a String
// Reverse each word of String
// Reverse the Position of word in String

import java.util.Scanner;

public class CopyString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println("S1 : " + s1);
        String s2 = "";
        String s3 = "";


        int i=0;
        while (i < s1.length())
        {
            s2 = s2 + s1.charAt(i);
            i++;
        }

        System.out.println("S2 : " + s2);

        int j=0;
        while (j < s1.length())
        {
            s3 = s1.charAt(j) + s3;
            j++;
        }

        System.out.println("S3 : " + s3);


        // Reverse each word of String --------------------------------------------------------

        String s4 = "";
        s1+=" ";
        String w = "";
        int p = 0;
        while(p < s1.length())
        {
            w = s1.charAt(p) + w;

            if(s1.charAt(p) == ' ')
            {
                s4 += w;
                w = "";
            }
            p++;
        }
        System.out.println("S4 : " + s4.trim());


        // Reverse the position of word in String ----------------------------------

        String s5 = "";
        s1+=" ";
        String w1 = "";
        int q = 0;
        while(q < s1.length())
        {
            w1 += s1.charAt(q);

            if(s1.charAt(q) == ' ')
            {
                s5 = w1 + s5;
                w1 = "";
            }
            q++;
        }
        System.out.println("S5 : " + s5.trim());


        // To convert the first letter of each word in UpperCase --------------------------------------

        String s6 = "";
        s1 = s1.trim();
        s6 += (char) (s1.charAt(0) - 32);
        int r = 1;
        while( r < s1.length())
        {
            if(s1.charAt(r) == ' ')
            {
                s6 += " ";
                s6 += (char) (s1.charAt(r + 1) - 32);
                r+=2;
            }
            else
            {
                s6 += s1.charAt(r);
                r++;
            }
        }

        System.out.println("S6 : " + s6.trim());





    }
}
