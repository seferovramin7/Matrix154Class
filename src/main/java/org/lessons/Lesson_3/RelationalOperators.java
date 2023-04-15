package org.lessons.Lesson_3;

public class RelationalOperators {
    public static void main(String[] args) {

        int adaminYashi = 65;
        String dayName;

        switch (adaminYashi) {
            case 1:
                dayName = "Bazar Ertesi";
                break;
            case 2:
                dayName = "Chershenbe axshami";
                break;
            case 65:
                dayName = "Chershenbe";
                break;
            case 4:
                dayName = "Cume axshami";
                break;
            case 5:
                dayName = "Cume";
                break;
            default:
                dayName = "Hechbir gun";
        }

//        System.out.println("Bugun heftenin " + dayName + " gunudur");


        int age = 17;
//        String allowed = (age >= 18) ? "Allowed" : "Not Allowed";
//        System.out.println("Age " + age + " is " + allowed);




        String icaze = (age >= 18) ? "verildi" : "verilmedi";

        System.out.println(icaze);

    }
}
