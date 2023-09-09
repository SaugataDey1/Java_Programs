package String_Playlist;

// To Check whether all the 26 alphabets of English characters are present or not.

public class Pangram
{
    public static void main(String[] args)
    {
        String s = "The Quick Brown Fox jumps over a Lazy dog";
        int ar[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        s = s.replace(" ","");
        s = s.toLowerCase();

        int i = 0;
        int index = 0;
        while(i < s.length())
        {
            index = s.charAt(i)-95;
            ar[index] = 1;
            i++;
        }

        int j = 0;
        while(j != 26)
        {
            if(ar[j]==1)
               ++j;
            else
            {
                System.out.println("Non-Pangram");
                System.exit(0);
            }
        }
        System.out.println("Pangram");

    }
}
