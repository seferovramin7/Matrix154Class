package org.lessons.Lesson_5;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();

        double[] temperatures = {72.5, 68.0, 70.5, 73.0, 69.5, 75.0, 72.5};

        temperatures[0] = a;


        // {1,2,3,4,5}
        // {"Yusif", "Akif"}

        int length = temperatures.length;

        double sum = 0.0;
        for (int i = 0; i < length; i++) {
            sum += temperatures[i];
        }
        sum /= length;
        System.out.println("Ortalama hava tempraturu : " + sum);
    }
}
