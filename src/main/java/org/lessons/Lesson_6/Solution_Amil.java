package org.lessons.Lesson_6;

public class Solution_Amil {
    //    public static void main(String[] args) {
//        int toplam = 0;
//        int[] a = new int[5];
//        System.out.println("Xaiş olunur 5 eded sayı girin");
//        Scanner scanner =new Scanner(System.in);
//
//        for (int i = 0; i <a.length ; i++) {
//            a [i] = scanner.nextInt();
//            toplam +=a[i];
//        }
//        String  sayılar = " ";
//        for (int i = 0; i <a.length ; i++) {
//            sayılar+=a[i] +" ";
//        }
//        System.out.println("Girdiyiniz Sayılar " + sayılar);
//        System.out.println("Toplam " + toplam);
//        System.out.println("Ortalama "+ toplam/5);
//    }
    public static void main(String[] args) {

        int[] a = {3, 6, 9, 12, 15,};
        int uzunluğ = a.length;
        int[] ters = new int[uzunluğ];
        for (int i = 0; i < uzunluğ; i++) {
            ters[uzunluğ - i - 1] = a[i];
        }
        for (int i = 0; i < uzunluğ; i++) {
            System.out.println(ters[i]);
        }

    }
}


// 6 88 2 23 22 34 44
// 2 6 22 23 34 44 88

