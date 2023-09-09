package Telusko;

// To find the Factorial of a Number

import java.util.Scanner;

public class p3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("Factorial of " + num + " : " + Factorial(num));
    }

    public static int Factorial(int n)
    {
        int f=1;
        for(int i=n; i>1; i--)
        {
            f=f*i;
        }

        return f;
    }
}
