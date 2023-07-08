package org.lessons.Lesson_21;

import org.lessons.Lesson_21.enums.CarNames;
import org.lessons.Lesson_21.enums.Day;

public class CarSell {
    CarNames name;

    Day day;

    public CarSell(CarNames name, Day day) {
        this.name = name;
        this.day = day;
    }

    public CarNames getName() {
        return name;
    }

    public void setName(CarNames name) {
        this.name = name;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }
}
