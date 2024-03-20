package org.example.threads.assignment.question3;


class A extends Thread {

    String msg;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(msg + i);
        }

    }

}
public class Main {

    public static void main(String[] args) {
        A a = new A();
        a.setPriority(5); //setting the priority of the thread
        A b = new A();
        A c = new A();
        A d = new A();
        A e = new A();
        a.msg = "Thread-1 -";
        b.msg = "Thread-2 -";
        c.msg = "Thread-3 -";
        d.msg = "Thread-4 -";
        e.msg = "Thread-5 -";

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();

        //it is in a random Sequence As we have
        // started all the threads at the same time
        //And the sequence of execution is not guaranteed
        //As our threads are running in parallel and are not yet synchronized
    }
}
