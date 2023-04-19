package org.lessons.Lesson_7;

import java.util.Random;
import java.util.Scanner;

public class Solution_Amil {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String Texmin[] = {"apple", "banana", "cherry", "orange", "grape"};

        boolean Oynayaq = true;
        while (Oynayaq) {
            System.out.println("Oynamaga baslayaq ");
            int randomNumber = random.nextInt(Texmin.length);
            char TexminEtmekUcunTesadufiSoz[] = Texmin[randomNumber].toCharArray();
            int TexminlerinMiqdari = TexminEtmekUcunTesadufiSoz.length;
            char oyuncuTexminplayerGuessi[] = new char[TexminlerinMiqdari];
            for (int i = 0; i < oyuncuTexminplayerGuessi.length; i++) {
                oyuncuTexminplayerGuessi[i] =
                        '_';                                              // "_ _ _ _ _ _ _ _"
            }
            boolean sozTexminEdilir = false;
            int yoxlamaq = 0;

            while (!sozTexminEdilir && yoxlamaq < 10) {
                System.out.println("Texminler: ");
                print(oyuncuTexminplayerGuessi);
                System.out.printf(" Sizin %d midariniz qalıb  .\n", TexminlerinMiqdari - yoxlamaq);
                System.out.println("Tek simvol daxil edin: ");
                char input = scanner.nextLine().charAt(0);
                yoxlamaq++;

                if (input == '-') {
                    sozTexminEdilir = true;
                    Oynayaq = false;
                } else {
                    for (int i = 0; i < TexminEtmekUcunTesadufiSoz.length; i++) {
                        if (TexminEtmekUcunTesadufiSoz[i] == input) {
                            oyuncuTexminplayerGuessi[i] = input;
                        }
                    }

                    if (isTheWordGuessed(oyuncuTexminplayerGuessi)) {
                        sozTexminEdilir = true;
                        System.out.println("Tebrikler! ");
                    }
                }
            } /* Sozun sonu texmin edilir*/
            if (!sozTexminEdilir) {
                System.out.println("Texminleriniz tukendi.");
            }
            /*Oyunun sonu!*/

            System.out.println("Yeniden oynamaq isterdinizmi? (He Yox) ");
            String secim = scanner.nextLine();
            if (secim.equals("Yox")) {
                Oynayaq = false;
            } else if (secim.equals("He")) {
                Oynayaq = true;
            }

        }
        System.out.println("Oyun bitti!");
    }

    public static void print(char array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static boolean isTheWordGuessed(char[] array) {
        boolean vezyet = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '_') {
                vezyet = false;
            }
        }
        return vezyet;
    }
}
