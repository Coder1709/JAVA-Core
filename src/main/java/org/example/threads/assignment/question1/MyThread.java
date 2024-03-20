package org.example.threads.assignment.question1;

class A extends  Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread-1");

        }

    }
}


class B extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 2");

        }

    }
}
public class MyThread  {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start();
        b.start();
    }
}
