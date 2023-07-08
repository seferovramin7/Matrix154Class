package org.lessons.Lesson_21;

import org.lessons.Lesson_21.enums.CarNames;
import org.lessons.Lesson_21.enums.Day;

public class MainClass {
    public static void main(String[] args) {
        CarSell volvo = new CarSell(CarNames.VOLVO, Day.SUNDAY);
        
        volvo.setDay(Day.WEDNESDAY);

        System.out.println(volvo.getDay());
    }
}
