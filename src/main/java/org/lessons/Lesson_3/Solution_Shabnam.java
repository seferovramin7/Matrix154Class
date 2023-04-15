package org.lessons.Lesson_3;

import java.util.Scanner;

public class Solution_Shabnam {
    public static void main(String[] args) {
        System.err.println("shexsi kabinete xosh gelmishsiniz!");
        System.out.println("Zehmet olmasa imtahan qiymetinizi daxil edin:");

        Scanner scanner = new Scanner(System.in);

        int imtahanQiymeti = scanner.nextInt();
        if (imtahanQiymeti >= 0 && imtahanQiymeti <= 100) {
            System.out.print("dereceniz " + " ");
            switch (imtahanQiymeti) {
                case 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100:
                    System.out.println("A");
                    break;
                case 80, 81, 82, 83, 84, 85, 86, 87, 88, 89:
                    System.out.println("B");
                    break;
                case 70, 71, 72, 73, 74, 75, 76, 77, 78, 79:
                    System.out.println("C");
                    break;
                case 60, 61, 62, 63, 64, 65, 66, 67, 68, 69:
                    System.out.print("D");
                    break;
                default:
            }
        } else {
            System.out.println("Bele bir kodlama movcud deyil");
        }
        String reqem = (imtahanQiymeti >= 0 && imtahanQiymeti <= 59) ? " F" : "";
        System.out.print(reqem);
    }
}
