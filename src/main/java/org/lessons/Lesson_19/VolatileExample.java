package org.lessons.Lesson_19;

public class VolatileExample {
    private volatile boolean flag = false;

    public static void main(String[] args) {
        VolatileExample example = new VolatileExample();
        example.start();
    }

    public void start() {
        // Thread 1 - Writer
        new Thread(() -> {
            System.out.println("Writer thread started.");
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flag = true;
            System.out.println("Flag value changed to true.");
        }).start();

        // Thread 2 - Reader
        new Thread(() -> {
            System.out.println("Reader thread started.");
            while (flag) {
            }
            System.out.println("Reader thread detected flag as true.");
        }).start();
    }
}

