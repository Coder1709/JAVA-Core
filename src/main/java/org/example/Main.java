package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {

    //The Adapter design pattern is a structural pattern that allows incompatible interfaces to work together.
    // In Java, there are several preexisting classes and interfaces that utilize the Adapter pattern. One of the
    // most well-known examples is the java.util.Arrays class, specifically its asList() method.


    public static void main(String[] args) {
        String[] array = {"apple", "banana", "orange"};

        // Using Arrays.asList() to convert array to List
        List<String> list = Arrays.asList(array);

        // Now you can use List methods on the array
        System.out.println(list); // Output: [apple, banana, orange]
    }

    //In this example, Arrays.asList(array) acts as an adapter that converts the array array into a List object list.
    // The adapter allows us to interact with the array using the List interface,
    // enabling us to perform operations such as iterating, adding, removing, etc.,
    // which are not directly supported by arrays in Java.
    //This use of the Adapter pattern simplifies the interaction between array-based code and code that expects a List,
    // making it easier to work with both types of data structures in Java.


}
