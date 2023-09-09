package Self_Practise.Questions;

// String str = "r#aa$pid"
// output = "d#ip$aar"

public class p3 {
    public static void main(String[] args)
    {
        String str1 = "r#aa$pid";
        char[] c = str1.toCharArray();
        int i = 0;
        int j = c.length-1;

        while(i<j)
        {
            // don't reverse when character is special
            if(!Character.isAlphabetic(c[i])) i++;

            else if (!Character.isAlphabetic(c[j])) j--;

            else {
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                i++;
                j--;
            }
        }
        String str2 = new String(c);
        System.out.println("Updated String : " + str2);
        System.out.println(c);
        System.out.println(str1);

    }
}
