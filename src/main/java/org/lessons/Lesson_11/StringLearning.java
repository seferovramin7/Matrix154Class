package org.lessons.Lesson_11;

public class StringLearning {

    static String name = "/Yus/if/    ";

    static String surname = "Yusif";

    char y = 'y';

    //   ['Y', 'U', 'S', 'I', 'F']

    public static void main(String[] args) {

//       name =  name.replaceAll("/","");
        name = name.replace("/", "").trim();

        System.out.println(name + "Salam");
    }

}
