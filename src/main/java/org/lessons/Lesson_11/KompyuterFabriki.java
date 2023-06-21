package org.lessons.Lesson_11;

public class KompyuterFabriki {

    static int countOfComputers = 0;

    String make;

    public KompyuterFabriki() {
        countOfComputers++;
    }

    public void drive(){
        System.out.println("I'm driving " + make);
    }

    public KompyuterFabriki(String make) {
        countOfComputers++;
        this.make = make;
    }

    public static int getCountOfComputers() {
        return countOfComputers;
    }

    public static void main(String[] args) {

        KompyuterFabriki hp = new KompyuterFabriki("Ferrari");
        KompyuterFabriki acer = new KompyuterFabriki();

        System.out.println(KompyuterFabriki.countOfComputers);

        System.out.println("----------------");
        hp.drive();
        acer.drive();
        System.out.println("----------------");
    }
}
