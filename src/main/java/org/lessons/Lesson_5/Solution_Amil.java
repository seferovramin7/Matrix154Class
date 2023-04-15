package org.lessons.Lesson_5;

import java.util.Random;
import java.util.Scanner;

public class Solution_Amil {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Sayı texmin edin");
        System.out.println("1-100 arası sayı girin ");
// İstifadeçiden sayı alırıq
        int texmin = input.nextInt();
//  Random sayı alırıq
        int sayi = rnd.nextInt(101);
        while (texmin != sayi) {
            if (texmin < 0 || texmin > 100) {
                System.out.println("1 ile 100 arasında bir sayı girin: ");
                texmin = input.nextInt();
            } else if (texmin < sayi) {
                System.out.println("Daha bğyük bir sayı girin: ");
                texmin = input.nextInt();
            } else {
                System.out.println("Daha kiçik bir sayı giriniz: ");
                texmin = input.nextInt();
            }
        }
// Eger sayımız ve texminimiz bir birine beraberdirse while dongusune girmez

        System.out.println("Tebrikler,  Qazandınız!");
    }
}
