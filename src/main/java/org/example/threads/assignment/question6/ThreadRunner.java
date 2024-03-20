/*
package org.example.threads.assignment.question6;

public class ThreadRunner implements Runnable {


    public int noOfThreads ;

    public ThreadRunner(int n){
        this.noOfThreads =n;
    }

    public void run(){
        System.out.println("Thread "+ noOfThreads + "is running");
    }


    public static void main(String[] args) {
        Thread[] threadArray = new Thread[111];

        for (int i = 1; i < 11; i++) {
                threadArray[i] = new Thread( new ThreadRunner(i+1));
                threadArray[i].start();
        }

        for (Thread thread : threadArray) {

            try {
                thread.start();
                thread.join();
            } catch (InterruptedException e) {
                e.getCause();
            }
        }

    }
}
*/


package org.example.threads.assignment.question6;

public class ThreadRunner implements Runnable {
    private int threadNumber;

    public ThreadRunner(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public void run() {
        System.out.println("Thread " + threadNumber + " is running");
    }

    public static void main(String[] args) {
        Thread[] threadArray = new Thread[10];

        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i] = new Thread(new ThreadRunner(i + 1));
        }

        for (Thread thread : threadArray) {
            try {
                thread.start();
                thread.join(); // Wait for the current thread to complete
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

