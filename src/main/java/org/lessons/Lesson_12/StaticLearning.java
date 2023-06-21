package org.lessons.Lesson_12;

import org.apache.commons.lang3.StringUtils;

public class StaticLearning {
//    static int a = m1();
//
//    static {
//        System.out.println("Inside static block");
//    }
//
//    // static method
//    static int m1() {
//        System.out.println("from m1");
//        return 20;
//    }

    // static method(main !!)
    public static void main(String[] args) {
//        System.out.println("Value of a : "+a);
//        System.out.println("from main");


        // GH23HJ - Raminin promokodu
        // gh23hJ - Raminin dostunun telefona yazdigi


//        String myStr1 = "GH23HJ";
//        String myStr2 = "gh23hJ";
//        System.out.println(myStr1.equalsIgnoreCase(myStr2)); // true


        String lalafo = "lalafo";
        String la = "la";


//        int i = lalafo.indexOf(la, 3);
//        System.out.println(i);


        int i = StringUtils.countMatches("lalafo", "la");
        System.out.println(i);

        ///  -2 -1 0 1 2

//        String myStr1 = "Hellooo";
//        String myStr2 = "Helloo";
//        System.out.println(myStr1.compareTo(myStr2)); // Returns 0 because they are equal
    }
}
