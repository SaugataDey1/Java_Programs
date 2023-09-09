package Telusko;

// To check whether the string is Palindrome or not

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p4
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1;
        System.out.print("Plsss Enter the String : ");
        s1 = br.readLine();

        if(isPalindrome(s1))
            System.out.println("The String is Palindrome");
        else
            System.out.println("The String is not Palindrome");
    }

    public static boolean isPalindrome(String s1)
    {
        String s2 ="";

        for(int i=s1.length()-1; i>=0; i--)
            s2+=s1.charAt(i);

        return s2.equals(s1);

    }
}
