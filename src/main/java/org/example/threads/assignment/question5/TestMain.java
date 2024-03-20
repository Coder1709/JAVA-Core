package org.example.threads.assignment.question5;

public class TestMain {

    public static void main(String[] args) {

        Object obj = new Object();

        PrintBye printBye = new PrintBye(obj);

        PrintHello printHello = new PrintHello(obj);


        printHello.start();
        printBye.start();

    }







}
