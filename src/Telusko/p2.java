package Telusko;

// To find the Prime Factors of a Numbers

import java.util.Scanner;
import java.lang.Math;

import static java.lang.Math.sqrt;

public class p2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please select your Number : ");
        int n = sc.nextInt();
        System.out.print("Prime Factors of a given Numbers are : " );
        primeFactorization(n);
    }
    public static void primeFactorization(int num)
    {
        for(int i=2; i<=sqrt(num); i++)
        {
            if(num%i==0)
            {
                int count = 0;
                while(num%i==0)
                {
                    num=num/i;
                    count++;
                }
                System.out.print(i+"^"+count+" * ");
            }
        }
        if(num!=1)
            System.out.print(num+"^"+1);
    }

}
