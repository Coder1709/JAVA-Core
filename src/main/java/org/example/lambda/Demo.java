package org.example.lambda;

public class Demo {
    public static void main(String[] args) {
        DivisibleByOneInterface divisibleByOneInterface = p -> p % 2 == 0;
        System.out.println(divisibleByOneInterface.isDivisibleByTwo(5));
        System.out.println(divisibleByOneInterface.isDivisibleByTwo(4));
        // Test with an even number
    }
}