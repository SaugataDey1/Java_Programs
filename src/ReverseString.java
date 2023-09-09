// To Reverse the String with Particular character of word in that Position
import java.io.*;
public class ReverseString {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException
    {
        System.out.print("Enter the Sentence : ");
        String s = br.readLine();
        System.out.println(ReverseSentence(s));
    }
    public static String ReverseSentence(String s)
    {
        String s2="", wd="";
        s+=" ";
        int l = s.length();
        for(int i=0; i<l; i++)
        {
            if(s.charAt(i)!=' ')
               wd = wd + s.charAt(i);
            else {
                s2 = wd + " " + s2;
                wd = "";
            }
        }
        return s2;
    }
}
