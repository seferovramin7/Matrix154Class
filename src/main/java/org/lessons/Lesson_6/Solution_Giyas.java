package org.lessons.Lesson_6;

import java.util.Scanner;

public class Solution_Giyas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Array nece elementden ibaret olsun?:");
        int catchElement = scanner.nextInt();
        int[] Numbers = new int[catchElement];
        int insert = 0;
        int showCatchElement = catchElement;
        while (insert < catchElement) {
            System.out.print("Zehmet olmasa  " + showCatchElement + "  element daha " + " yazin:  ");
            Numbers[insert] = Integer.parseInt(scanner.next());
            insert++;
            showCatchElement--;


        }
        int total = 0;
        for (int i = 0; i < Numbers.length; i++) {

            total += Numbers[i];
        }
        double avg = total / Numbers.length;
        System.out.println("Girilen Reqemlerin cemi:" + " " + total);
        System.out.println("Arraydeki deyerlerin ortalamasi:" + " " + (avg));

    }

}
