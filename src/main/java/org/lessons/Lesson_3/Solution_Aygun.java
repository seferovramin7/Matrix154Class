package org.lessons.Lesson_3;

import java.util.Scanner;

public class Solution_Aygun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bali daxil edin: ");
        int bal = sc.nextInt();
        int mod = bal / 10;
        String netice;
        boolean a = (bal <= 59 && bal >= 0) ? false : true;
        if (a == false) {
            netice = "F";
        } else {
            switch (mod) {
                case 10:
                    netice = "A";
                    break;
                case 9:
                    netice = "A";
                    break;
                case 8:
                    netice = "B";
                    break;
                case 7:
                    netice = "C";
                    break;
                case 6:
                    netice = "D";
                    break;
                default:
                    netice = "Sehv emeliyyat";
            }
        }
        System.out.println("Neticeniz " + netice + "-dir");
    }
}
