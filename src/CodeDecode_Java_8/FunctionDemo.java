package CodeDecode_Java_8;

import java.util.function.Function;

// Function is a Predefined Functional Interface having apply() as abstract method that can return anything

public class FunctionDemo
{
    public static void main(String[] args)
    {
        Function<Integer, Integer> squareMe = i -> i*i;
        System.out.println("Square of 5 is " + squareMe.apply(5));

        Function<Integer, Integer> doubleIt = i -> 2*i;

        Function<Integer, Integer> cubeIt = i -> i*i*i;

        System.out.println("First doubling using apply : " + doubleIt.andThen(cubeIt).apply(2));  // first doubleIt then cubeIt
        System.out.println("First cubing using compose : " + doubleIt.compose(cubeIt).apply(2));  // first cubeIt then doubleIt
    }
}
