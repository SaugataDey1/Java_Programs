// To find the Largest Number in an Array and it's particular index
import java.util.*;
public class MaxNoArray {
    static int max;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Length of an Array :");
        int l = sc.nextInt();
        int a[] = new int[l];
        System.out.print("Input Array");
        for(int i=0; i<l; i++)
            a[i] = sc.nextInt();

        max = maxNo(a);

        System.out.println("Max : " + max);
    }

    public static int maxNo(int[] a) {
        int m = 0;
        for(int i=0; i<a.length; i++)
        {
            if(a[i]>m) m=a[i];
            else continue;
        }
        return m;
    }
}
