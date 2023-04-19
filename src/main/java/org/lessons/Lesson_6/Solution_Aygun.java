package org.lessons.Lesson_6;

import java.util.Scanner;

public class Solution_Aygun {
    public static void main(String[] args) {
//      --------------------------------  task_1  --------------------------------
        int[] numbers1 = {3, 6, 9, 12, 15};
        for (int i = numbers1.length - 1; i >= 0; i--) {
            System.out.print(numbers1[i] + " ");
        }

//      --------------------------------  task_2  --------------------------------
        int[] numbers = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("\n" +  "Please input : ");
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        int avarage = sum / numbers.length;
        System.out.println("cem: " + sum + "ortalama: " + avarage);
    }
}
