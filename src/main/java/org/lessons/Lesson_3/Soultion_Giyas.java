package org.lessons.Lesson_3;

import java.util.Scanner;

public class Soultion_Giyas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Final imtahan balinizi yazin:");
        int finnalyNote = scanner.nextInt();
        System.out.print("Araliq imtahan balinizi yazin:");
        int visaNote = scanner.nextInt();
        int avarage = (int) ((finnalyNote * 0.6) + (visaNote + 0.4));
        String derece = null;
        switch (avarage) {
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
                derece = "A";
            default:
                if (avarage > 80 && avarage < 89) {
                    derece = "B";
                } else if (avarage > 70 && avarage < 79) {
                    derece = "C";
                } else if (avarage > 60 && avarage < 69) {

                    derece = "D";
                }
        }
        String result = (avarage > 0 && avarage < 59) ? derece = "F" : "Yanlis deyerler";
        System.out.println("Ortalama baliniz:" + avarage + " " + derece + " aldniniz");
    }
}
