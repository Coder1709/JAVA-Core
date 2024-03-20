package org.example.threads.assignment.question5;

public class PrintBye extends Thread {


    Object object ;

    PrintBye(Object object){
        this.object =object;

    }
    @Override
    public void  run (){


        synchronized (object){
            for (int i = 0; i < 10; i++) {
                System.out.println("Bye");
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
