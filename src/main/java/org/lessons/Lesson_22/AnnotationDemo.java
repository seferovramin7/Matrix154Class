package org.lessons.Lesson_22;

import java.lang.annotation.*;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface QeydKaghizi {
    String value();
}

class Conference {
    @QeydKaghizi("Important topic")
    public void presentation1() {
        System.out.println("Presentation 1");
    }

    @QeydKaghizi("Demo code")
    public void presentation2() {
        System.out.println("Presentation 2");
    }
}

public class AnnotationDemo {
    public static void main(String[] args) throws NoSuchMethodException {
        // Get annotations from a method using Reflection
        Conference conference = new Conference();
        Class<? extends Conference> conferenceClass = conference.getClass();

        // Get annotations for presentation1() method
        Method presentation1Method = conferenceClass.getMethod("presentation1");
        QeydKaghizi qeydKaghizi1 = presentation1Method.getAnnotation(QeydKaghizi.class);
        System.out.println("Presentation 1: " + qeydKaghizi1.value());

        // Get annotations for presentation2() method
        Method presentation2Method = conferenceClass.getMethod("presentation2");
        QeydKaghizi qeydKaghizi2 = presentation2Method.getAnnotation(QeydKaghizi.class);
        System.out.println("Presentation 2: " + qeydKaghizi2.value());

        Deger a = Deger.A;

    }
}
