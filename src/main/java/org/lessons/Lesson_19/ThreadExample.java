package org.lessons.Lesson_19;

public class ThreadExample {

    public static void main(String[] args) {
        // Create and start a new thread
        MyThread myThread = new MyThread();
        myThread.start();

        MySecondThread mySecondThread = new MySecondThread();
        mySecondThread.start();

    }
}
// synchronized
// asynchronized

class MyThread extends Thread {
    @Override
    public void run() {
        // Perform some task in the new thread
        for (int i = 0; i < 5; i++) {
            System.out.println("New Thread: " + i);
        }
    }
}

class MySecondThread extends Thread{
    @Override
    public void run() {
        for (int i = 5; i < 10; i+=2) {
            System.out.println("My Thread: " + i);
        }
    }
}