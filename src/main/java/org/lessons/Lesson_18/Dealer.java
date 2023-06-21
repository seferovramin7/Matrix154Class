package org.lessons.Lesson_18;

import java.util.Scanner;

public class Dealer {
    public static void main(String[] args) throws BudceYeterliDeyilException {
        Car toyota = new Car("Toyota", 1000, 2);
        Car lexus = new Car("lexus", 1000, 2);
        Car vw = new Car("vw", 1000, 2);
        Car nissan = new Car("nissan", 1000, 2);
        Car mazda = new Car("mazda", 1000, 2);

        Car[] a = new Car[5];
        a[0] = toyota;
        a[1] = lexus;
        a[2] = vw;
        a[3] = nissan;
        a[4] = mazda;


        try (Scanner scanner = new Scanner(System.in)) {
            int money = scanner.nextInt();
            if (money < 100) {
                throw new BudceYeterliDeyilException("Mashin almagha pulunuz yeterli deyil");
            }
        }

    }
}
