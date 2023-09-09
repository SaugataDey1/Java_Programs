// Check whether the Input String is Palindrome or not
import java.io.*;
public class Palindrome {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1;
        System.out.print("Enter the String to check Whether it is Palindrome or not : ");
        s1 = br.readLine();

        if(CheckPalindrome(s1))
            System.out.println(s1 + " : is Palindrome");
        else
            System.out.println(s1 + " : Not Palindrome");

    }

    public static boolean CheckPalindrome(String s1)
    {
        String s2="";
        int l = s1.length();
        for(int i=0; i<l; i++)
            s2 = s1.charAt(i) + s2;

        System.out.println(s1);
        System.out.println(s2);

        /*
        if(s1.equals(s2))
            return true;
        else return false;
        */

       return s1.equals(s2);
    }
}
