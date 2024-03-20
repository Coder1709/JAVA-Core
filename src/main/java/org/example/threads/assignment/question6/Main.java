package org.example.threads.assignment.question6;

//Write a java program that create a number of threads and each thread must start
//after the completion of the previous thread except the first one



public class Main implements Runnable {
    private int threadNumber;

    public Main(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        System.out.println("Thread " + threadNumber + " is running.");
    }

    public static void main(String[] args) {
        int numberOfThreads = 5;
        Thread[] threads = new Thread[numberOfThreads];

        for (int i = 0; i < numberOfThreads; i++) {
            if (i == 0) {
                threads[i] = new Thread(new Main(i + 1));
                threads[i].start();
            } else {
                try {
                    threads[i - 1].join(); // Wait for the previous thread to complete
                    threads[i] = new Thread(new Main(i + 1));
                    threads[i].start();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
