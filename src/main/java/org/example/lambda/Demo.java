package org.example.lambda;

import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args) {
        DivisibleByOneInterface divisibleByOneInterface = p -> p % 2 == 0;
        System.out.println(divisibleByOneInterface.isDivisibleByTwo(5));
        System.out.println(divisibleByOneInterface.isDivisibleByTwo(4));


        DivisibleByOneInterface divisibleBy5 = p -> p%5 ==0;
        System.out.println(divisibleBy5.isDivisibleByTwo(5));
        System.out.println(divisibleBy5.isDivisibleByTwo(4));

        // Test with an even number

        Predicate <Integer> divisibleByTwo = p -> p % 2 == 0;
        System.out.println(divisibleByTwo.test(5));
    }
}