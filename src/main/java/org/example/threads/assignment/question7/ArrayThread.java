package org.example.threads.assignment.question7;

public class ArrayThread extends Thread  {




    private static int[] sharedArray;

    public ArrayThread(int[] array) {
        sharedArray = array;
    }

    @Override
    public void run() {
        for (int i = 0; i < sharedArray.length; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() +
                    " Reading array element at index " + i + ": " + sharedArray[i]);
            sharedArray[i]++;
            System.out.println("Thread " + Thread.currentThread().getName() +
                    " Incremented array element at index " + i + ": " + sharedArray[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int numberOfThreads = 3;
        ArrayThread[] threads = new ArrayThread[numberOfThreads];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new ArrayThread(array);
            threads[i].start();
        }

        for (ArrayThread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Final Array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
