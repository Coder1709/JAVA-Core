package org.example.threads.assignment.question5;

public class PrintHello extends Thread{

    Object object;

    PrintHello(Object object){
        this.object = object;
    }

    @Override
    public void run() {
        synchronized (object) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello");
                object.notify(); // Notify the other thread to proceed
                try {
                    if (i < 9) // Only wait if it's not the last iteration
                        object.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }
}
