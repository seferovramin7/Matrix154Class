package org.lessons.Lesson_6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution_Altay {
    public static final String GREEN = "\u001B[92m";
    public static final String RESET = "\u001B[0m";
    public static final String YELLOW = "\u001B[93m";
    public static final String BLUE = "\u001B[36;1m";

    public static void main(String[] args) {
        link:
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print(BLUE + " Massivin uzunluqun daxil edin: " + RESET);
            int d;
            while ((d = scanner.nextInt()) < 1 || d > 20) {
                System.out.println("Reqem  1 dan 20 dək olmalıdır: ");
            }
            Integer[] reqemler = new Integer[d];
            int sum = 0;
            System.out.printf(GREEN + "Massivin elementlerini random olsun " + YELLOW + "1" + RESET);
            System.out.printf(
                    GREEN + " , ozunuz daxil etmek isdeyirsinizse " + YELLOW + "2 " + GREEN + "yazin:" + RESET);
            int a = scanner.nextInt();
            int c = 1;
            int b = 1000;
            if (a == 1) {
                for (int i = 0; i < reqemler.length; i++) {
                    reqemler[i] = c + (int) (Math.random() * b);
                }
            } else if (a == 2) {
                for (int i = 0; i < d; i++) {
                    System.out.print(i + ":");
                    reqemler[i] = scanner.nextInt();
                }
            } else {
                System.err.println("program deyandirildi");
                break link;
            }
            for (int i = 0; i < reqemler.length; i++) {
                sum += reqemler[i];
            }
            Arrays.sort(reqemler);
            for (int values : reqemler) {
                System.out.print(values + " > ");
            }
            System.out.println();
            Arrays.sort(reqemler, Collections.reverseOrder());
            for (int values : reqemler) {
                System.out.print(values + " < ");
            }
            System.out.println();
            System.out.println(GREEN + "massivdeki reqemlerin cemi: " + RESET + sum);
            System.out.print(YELLOW + "massivdeki reqemlerin ededi ortasi: " + RESET + sum / reqemler.length);
        }
    }
}
