package org.lessons.Lesson_3;

import java.util.Scanner;

public class Solution_Altay {
    public static void main(String[] args) {
        link:
        {
            Scanner scanner = new Scanner(System.in);
            //qayib limitini yoxlayir 7 den artiq olanda proqrami bitirir
            System.out.printf("Qayib sayini daxil edin: ");
            int f = scanner.nextInt();
            if (f > 7) {
                System.out.println("siz qayib limitin kecmisiniz");
                break link;
            }
            // daxil olunan reqemlerin diapazonunu yoxlayir kenar olanda yeniden daxil etmeyi teklif edir
            System.out.printf("Midterm balinizi daxil edin: ");
            double a;
            while ((a = scanner.nextInt()) < 0 || a > 20) {
                System.out.println("Qiymət  0 dan 20 dək olmalıdır: ");
            }
            // daxil olunan reqemlerin diapazonunu yoxlayir kenar olanda yeniden daxil etmeyi teklif edir
            System.out.printf("Teqdimat balinizi daxil edin: ");
            double b;
            while ((b = scanner.nextInt()) < 0 || b > 20) {
                System.out.println("Qiymət  0 dan 20 dək olmalıdır: ");
            }
            // daxil olunan reqemlerin diapazonunu yoxlayir kenar olanda yeniden daxil etmeyi teklif edir
            System.out.printf("Quiz balinizi daxil edin: ");
            double c;
            while ((c = scanner.nextInt()) < 0 || c > 10) {
                System.out.println("Qiymət  0 dan 10 dək olmalıdır: ");
            }
            // daxil olunan reqemlerin diapazonunu yoxlayir kenar olanda yeniden daxil etmeyi teklif edir
            System.out.printf("İmtahan balinizi daxil edin: ");
            double d;
            while ((d = scanner.nextInt()) < 0 || d > 50) {
                System.out.println("Qiymət  0 dan 50 dək olmalıdır: ");
            }
            //daxil olunan ballari toplayir
            System.out.println(a + b + c + d);
            double e = a + b + c + d;
            // ballarin cemini verilen herif qiymetlerle uygunlasdirir
            if (e >= 90 && e <= 100) {
                System.out.println("A");
            } else if (e >= 80 && e <= 89) {
                System.out.println("B");
            } else if (e >= 70 && e <= 79) {
                System.out.println("C");
            } else if (e >= 60 && e <= 69) {
                System.out.println("D");
            } else if (e >= 0 && e <= 59) {
                System.out.println("F");
            } else {
                System.out.println("ERROR");
            }
        }
    }
}
