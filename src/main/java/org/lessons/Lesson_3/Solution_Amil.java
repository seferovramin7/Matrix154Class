package org.lessons.Lesson_3;

import java.util.Scanner;

public class Solution_Amil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İmtahan Balıvızı girin");
        int a = scanner.nextInt();
        String imtahanNeticesi;
        int bal = a;

        if (59 >= bal) {
            imtahanNeticesi = "F";
        } else if (69 >= bal) {
            imtahanNeticesi = "D";
        } else if (79 >= bal) {
            imtahanNeticesi = "C";
        } else if (89 >= bal) {
            imtahanNeticesi = "B";
        } else if (100 >= bal) {
            imtahanNeticesi = "A";
        } else {
            imtahanNeticesi = "";
        }
        System.out.println("Balım =" + " " + a + " " + "Cavab = " + imtahanNeticesi);

        String balım = (100 >= bal) ? "" : "sehv";
        System.out.println(balım);
    }
}
