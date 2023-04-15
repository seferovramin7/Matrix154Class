package org.lessons.Lesson_3;

import java.util.Scanner;

public class Solution_Haji {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Siz imtahandan nece almisiniz");
        int a = scanner.nextInt();
        // Movzu if-else, movzu relation operators < ve > , movzu Logical operators,movzu switch ve movzu ternary operators
        if (a < 0 || a > 100) {
            System.out.println("error");
        } else if (a > 0 && a < 51) {
            System.out.println("F");
        } else if (90 < a && a <= 100) {
            System.out.println("A");
        } else if (80 < a && a <= 90) {
            System.out.println("B");
        } else if (70 < a && a <= 80) {
            System.out.println("C");
        } else if (60 < a && a <= 70) {
            System.out.println("D");
        }
        String b;
        switch (a) {
            case 60:
            case 59:
            case 58:
            case 57:
            case 56:
            case 55:
            case 54:
            case 53:
            case 52:
            case 51:
                b = "E";
                break;
            default:
                b = " ";
        }
        System.out.println(b);
        //ternary operators
        String c = (a >= 51) ? "Siz imtahandan kecdiniz" : "Siz imtahandan kesildiniz";
        System.out.println(c);
    }
}
