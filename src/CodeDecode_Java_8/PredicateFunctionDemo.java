package CodeDecode_Java_8;

import java.util.function.Predicate;

// Predicate is Predefined Functional Interface having test() has an abstract method of return type boolean

public class PredicateFunctionDemo
{
    public static void main(String[] args)
    {
        Predicate<String> checkLength = s -> s.length() >= 5;
        System.out.println("The Length of String is greater than 5 : " + checkLength.test("code decode"));

        Predicate<String> checkEvenLength = s -> s.length() % 2 == 0;
        System.out.println("The Length of String is : " + checkEvenLength.test("code decode"));

        System.out.println("After merging with and " + checkLength.and(checkEvenLength).test("code decode"));

        System.out.println("After merging with or " + checkLength.or(checkEvenLength).test("code decode"));

        System.out.println("After merging with negate " + checkLength.negate().test("code decode"));
    }
}
