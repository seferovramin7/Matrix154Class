package org.lessons.Lesson_11;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Giyas_Roman_Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Roma reqemini daxil edin(Kicik ve ya boyuk herif ferq etmir):");
        String enterRoma = scanner.next().toUpperCase();
        Giyas_Roman_Solution romanToInt = new Giyas_Roman_Solution();

        System.out.println(romanToInt.romanToInt(enterRoma.toLowerCase()));
    }

    public int romanToInt(String s) {
        //Map sinifleri listler kimi data saxlamaq ucun istifade olur lakin collection siniflerinden implament elemir
        // eyni zamanda iterator sinifinde implement elemir ona gore siralamaq ucun baska yontemler var
        // maplerin esas ozelliyi value,ve key lerle ifade edilmesidir,Linkedlistlere gore daha yavasdilar
        // ve s
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        ;//XI X = 10 I=1
        int result = 0;
        //  input = IX; && input = XI
        for (int i = 0; i < s.length(); i++) { //lenght = 2 && lenght =2
            int s1 = roman.get(s.charAt(i)); //0 = I=1 && i= 0 s1=X=10
            if (i + 1 < s.length()) { //i +1 = 1<2 true && i=0+1=1 1<2 true
                int s2 = roman.get(s.charAt(i + 1)); // i =0+1 =1, s2=X=10 &&  i=0+1 =1 s2=I=1
                if (s1 < s2) { // 1<10 true && s1=10 s2 = 1 s1<s2 false else durumu
                    result += s2 - s1; //result = 10-1=9;
                    i++;//i=1+1=2  false  return result = 9; &&
                } else {
                    result +=
                            s1;// result = s1=10 forun basina donur s1 =1=I 1 e beraber olur ilk if sertine girmir ikinci else atir
                }

            } else {
                result +=
                        s1; //beyaq result 10 beraber idi, indi result=10+1 =11 belelikle ekrana 11 deyeri cixir
            }       // method int deyer return etdiyi ucun sonda return resul edirik

        }

        return result;
    }
}