package org.lessons.Lesson_19;

public class WaitNotifyExample {

    private static Object lock = new Object();

    public static void main(String[] args) {
        Thread oddNumbers = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 1: Waiting...");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: Waked up!");
            }
        });

        Thread evenNumbers = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 2: Notifying...");
                oddNumbers.notify();
                System.out.println("Thread 2: Notified!");
            }
        });

        oddNumbers.start();
        evenNumbers.start();
    }
}

