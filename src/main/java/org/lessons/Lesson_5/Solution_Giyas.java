package org.lessons.Lesson_5;

import java.util.Random;
import java.util.Scanner;

public class Solution_Giyas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        String answer = "";

        System.out.println(
                "Salam,Texmin oyununa xos gelmisiniz,Oyun pulludur ve her dogru texmine gore 5 Azn qazanacaqsiniz ");
        System.out.println(
                "(Oyuna baslamaq ucun 10 Azn Medaxil edilmelidir) Zehmet olmasa Kredit karti melumatlarinizi doldurun");
        System.out.print("Kart nomresini daxil edin:");
        int cardNumber = scanner.nextInt();
        System.out.print("Tarix qeyd edin:");
        String date = scanner.next();
        System.out.print("Cvv ni daxil edin:");
        int cvv = scanner.nextInt();
        System.out.print("Medaxil meblegi Minimum 10 Azn Teskil edir (Bu sizin oyunda balansiniz olaraq gorulecek):");
        double balance = scanner.nextDouble();
        while (balance <= 10) {
            if (balance < 10) {
                System.out.println("Zehmet olmasa" + " " + (10 - balance) + " qeder odenis edin");
                balance += scanner.nextDouble();
                if (balance >= 10) {
                    System.out.println("Odenis tamamlandi ) ");
                } else {
                    System.out.println("10 Azn e tamamlanmadi!");
                }
            } else if (balance >= 10) {
                System.out.println("Odenis Ugurlu oldu kartinizdan " + balance + "Azn Cixildi");
                break;
            } else {
                System.out.println("Odenis Qeyde alinmadi");
            }
        }

        int point = 5;
        int xRand = rand.nextInt(30);
        int catchRand = 0;


        while (answer != "y") {

            if (point != 0) {

                System.out.println("Reqemi texmin edin!");
                catchRand = Integer.parseInt(scanner.next());
                if (catchRand == xRand) {
                    balance = balance + 5;

                    System.out.println(
                            "Tebrikler dogru TEXMIN  !" + "  Davam etmek isteyirsiniz? Cavab:h/y  " + " Balansiniz:" +
                                    " " + balance);
                    point = 0;
                    answer = scanner.next();
                    if (answer.equals("h")) {
                        point = 5;
                        xRand = rand.nextInt(30);
                    } else if (answer.equals("y")) {
                        point = 0;
                        break;
                    } else {
                        System.out.println("Cavab duzgund deil!");

                    }
                } else if (catchRand < xRand) {
                    point--;
                    System.out.println("{Yuxari} Yanlis Texmin" + "(Qalan texmin sayisi:" + " " + point);

                } else if (catchRand > xRand) {
                    point--;
                    System.out.println("{Asagi} Yanlis Texmin" + "(Qalan texmin sayisi:" + " " + point);
                } else {

                    System.out.println("Nese duz getmedi!");
                    break;

                }
            } else if (point == 0) {
                System.out.println(
                        "Texmin etme sayisini asdiniz (Texmin etme sayisini artirmaq isteyirsiniz?) cavab:h/y");
                answer = scanner.next();
                if (answer.equals("h")) {
                    point = +5;
                    balance = balance - 10;
                    if (balance < 10) {
                        System.out.println("Kifayet qeder balansiniz yoxdur" + " " +
                                "Balansinizi artirmaq isteyirsiniz? Cavab:h/y");
                        answer = scanner.next();
                        if (answer.equals("h")) {
                            System.out.println("Kartnizdan 10 Azn Cixildi");
                            balance = 10;
                        } else if (answer.equals("Y")) {
                            System.out.println("Balansiniz kifayet deil");
                            break;
                        } else {
                            System.out.println("Nese baska bir sey");
                            break;

                        }
                    } else if (balance >= 10) {
                        System.out.println("Kartinizdan 10 Azn cixildi " + "Balans:" + " " + balance);
                    } else {
                        System.out.println("Balansla bagli xeta");
                        break;
                    }


                } else if (answer.equals("y")) {
                    break;
                } else {
                    System.out.println("Cavab duzgun deil program baglanir!");
                    break;
                }

            } else {
                System.out.println("Maksimal Texmin sayine catdiniz ve meglub oldunuz!");
                break;
            }


            System.out.println(" Balansiniz: " + " " + balance);

        }
        balance = 0;
        balance = balance - 100;
        System.err.println(
                "((YOUR ARE HACKED BRO)))" + "  100 AZN has been deducted from your credit card " + " ))" + "Balans:" +
                        " " + balance);


    }
}
