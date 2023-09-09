package String_Playlist;

// To count the Length of String

import java.util.Scanner;

public class String_Length
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        s = s.concat("\0");

        int i = 0;
        int count = 0;
        while(s.charAt(i) != '\0')
        {
            count++;
            i++;
        }

        System.out.println("The Length of " + s + " : " + count);

    }
}
