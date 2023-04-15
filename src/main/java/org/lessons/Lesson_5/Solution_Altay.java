package org.lessons.Lesson_5;

import java.util.Scanner;

public class Solution_Altay {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(GREEN + "Gizli ededi tapin " + GREEN);
        int a = 1;
        int b = 100;
        int d;
        int e = 1;
        //int c =20;
        int c = a + (int) (Math.random() * b);
        while ((d = scanner.nextInt()) < c || d > c) {
            e = e + 1;
            String eded = (d > c) ? d + RED + " Gizli ededden boyukdur" + RESET : d + RED + " Gizli ededden kicikdir" + RESET;
            System.out.println(eded);
        }
        System.out.println(GREEN + "TEBRIK EDIRIK SIZ " + e + " DEFEYE TAPDIZ" + GREEN);
    }
}
