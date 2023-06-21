package org.lessons.Lesson_19;

public class SumCalculator implements Runnable {
    private int[] numbers;
    private long sum;

    public SumCalculator(int[] numbers) {
        this.numbers = numbers;
        this.sum = 0;
    }

    @Override
    public void run() {
        for (int number : numbers) {
            sum += number;
        }
    }

    public long getSum() {
        return sum;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        int[] array3 = {11, 12, 13, 14, 15};

        SumCalculator calculator1 = new SumCalculator(array1);
        SumCalculator calculator2 = new SumCalculator(array2);
        SumCalculator calculator3 = new SumCalculator(array3);

        Thread thread1 = new Thread(calculator1);
        Thread thread2 = new Thread(calculator2);
        Thread thread3 = new Thread(calculator3);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long totalSum = calculator1.getSum() + calculator2.getSum() + calculator3.getSum();
        System.out.println("The sum of all numbers is: " + totalSum);
        System.out.println("Calculation done.");
    }
}

