import java.sql.SQLOutput;
import java.util.Arrays;

// Binary Search Algorithm
public class BinarySearch
{
    public static void main(String[] args)
    {
        int a[] = {-4, -1, 7, 3, 10, 11};
        Arrays.sort(a);
        System.out.println(BinarySearch(a, 7));
    }

    public static int BinarySearch(int a[], int key)
    {
        int l = 0;
        int h = a.length-1;

        while(l<=h)
        {
            int mid = (l+h)/2;
            int midVal = a[mid];

            if(midVal == key)
                return mid;
            else if (key > midVal)
                l = mid+1;
            else
                h = mid-1;
        }
        return -1;
    }

}
