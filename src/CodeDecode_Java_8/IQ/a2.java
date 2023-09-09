package CodeDecode_Java_8.IQ;

// Multiply two numbers using functional interface

public class a2
{
    public static void main(String[] args)
    {
        f1 m = (a,b) -> a*b;
        System.out.println(m.multiply(3,2));
    }
}
