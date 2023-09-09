package Self_Practise.Questions;

//

import java.util.Arrays;

public class p4
{
    public static void main(String[] args)
    {
        int a[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int i = 0;
        int j = a.length-1;
        
        while(i<j)
        {
            if(a[i]<0) i++;
            else if (a[j]>0) j--;
            else {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        System.out.println("Output Array : " + Arrays.toString(a));
    }
}
