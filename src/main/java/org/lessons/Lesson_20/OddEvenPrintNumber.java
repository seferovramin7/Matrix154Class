package org.lessons.Lesson_20;

public class OddEvenPrintNumber {
    boolean odd;
    int count = 1;
    int max = 1000;
    public void printOdd() {
        synchronized (this) {
            while (count < max) {
                while (!odd) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Tek Reqemler :" + count);
                count++;
                odd = false;
                notify();
            }
        }
    }
    public void printEven() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        synchronized (this) {
            while (count < max) {
                while (odd) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Cut Reqemler :" + count);
                count++;
                odd = true;
                notify();
            }
        }
    }
    public static void main(String[] args) {
        OddEvenPrintNumber printer = new OddEvenPrintNumber();
        printer.odd = true;
        Thread t1 = new Thread(printer::printEven);
        Thread t2 = new Thread(printer::printOdd);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
