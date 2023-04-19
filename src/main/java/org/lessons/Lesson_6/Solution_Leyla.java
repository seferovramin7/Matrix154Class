package org.lessons.Lesson_6;

import java.util.Scanner;

public class Solution_Leyla {
    public static void main(String[] args) {
        int average;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < 10; i++) {
            //reading array elements from the user
            array[i] = scanner.nextInt();
        }
        // accessing array elements using the for loop
        for (int i = 0; i < 10; i++) {
            // System.out.println(array[i]);
            sum += array[i];
        }
        average = sum / array.length;
        System.out.println("Sum of elements are: " + sum + "\n" + "Average of elements are: " + average);


//        int[] numbers = {3, 6, 9, 12, 15};
//        System.out.println(" Elements of array:");
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }
//        System.out.println("Reverse of elements: ");
//        for (int i = numbers.length - 1; i >= 0; i--) {
//            System.out.println(numbers[i]);
//        }
    }
}
