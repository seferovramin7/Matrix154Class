package org.lessons.Lesson_19;

import java.time.LocalDateTime;

public class SleeperMain {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(LocalDateTime.now());

        Thread.sleep(5000);

        System.out.println(LocalDateTime.now());

    }
}
