// BubbleSort
public class BubbleSort {
    public static void main(String[] args)
    {
        int a[] = {4,3,7,1,5};
        for(int i=0; i<a.length-1; i++)
        {
            for(int j=0; j<a.length-i-1; j++)
            {
                if(a[j+1]<a[j])
                    swap(a, j+1, j);
            }
        }

        for (int elm: a)
            System.out.print(elm + " ");
    }
    public static int[] swap(int a[], int i, int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;

        return a;
    }
}
