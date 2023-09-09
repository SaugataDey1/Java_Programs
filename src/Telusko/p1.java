package Telusko;

// To check whether the given number is Prime or not

import java.util.Scanner;

public class p1
{
    public static boolean isPrime = true;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        checkPrime(num);
        if (isPrime) System.out.println(num + " : is Prime Number");
    }

    public static void checkPrime(int num)
    {
        for(int i=2; i<=num/2; i++)
        {
            if(num%i==0)
            {
                isPrime = false;
                System.out.println(num + " : is not a Prime Number");
                break;
            }
            else continue;
        }
    }


}
