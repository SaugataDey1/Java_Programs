// To check whether that Particular no. is Prime or not

import java.util.*;
public class PrimeNumber
{
    static boolean check;
    public static void main(String[] args) throws ArithmeticException
    {
        System.out.print("Please give the input to check : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CheckPrime(n);
        if(!check) System.out.println(n + " : is a Prime Number");
    }
    public static void CheckPrime(int n) throws ArithmeticException
    {
        for(int i=2; i<=n/2; i++)
        {
            if(n%i==0)
            {
                check = true;
                System.out.println( n + " : is not a Prime Number");
                break;
            }
            else continue;
        }
    }
}

