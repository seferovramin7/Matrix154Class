package org.lessons.Lesson_11;

import java.util.Scanner;

public class Altay_Maze {
    public static final String GREEN = "\u001B[92m";
    public static final String RESET = "\u001B[0m";
    public static final String YELLOW = "\u001B[93m";
    public static final String BLUE = "\u001B[36;1m";
    public static final String RED = "\u001B[31m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int e = 0;
        int c = 1;
        int r = 1;
        System.out.println(YELLOW + "oyuna hazirsinizsa Enter duymesini basin! UGURLAR" + RESET);
        System.out.println(YELLOW + "idare etmek ucun W,S,A,D duymelerini istifade edin" + RESET);
        while (!(c == 4) || !(r == 14)) {
            String[][] a = {
                    {BLUE + "╔", "═", "═", "═", "═", "═", "═", "═", "═", "═", "═", "═", "═", "═",
                            "═", "═", "═", "═", "═", "╗" + RESET},
                    {BLUE + "║" + RESET, " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                            " ", " ", " ", " ", " ", " ", BLUE + "║" + RESET},
                    {BLUE + "╟" + RESET, " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                            " ", " ", " ", " ", " ", " ", BLUE + "║" + RESET},
                    {BLUE + "║" + RESET, " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                            " ", " ", " ", " ", " ", " ", BLUE + "║" + RESET},
                    {BLUE + "║" + RESET, " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                            " ", GREEN + "E" + RESET, " ", " ", " ", " ", BLUE + "║" + RESET},
                    {BLUE + "║" + RESET, " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
                            " ", " ", " ", " ", " ", " ", BLUE + "║" + RESET},
                    {BLUE + "╚", "═", "═", "═", "═", "═", "═", "═", "═", "═", "═", "═", "═", "═",
                            "═", "═", "═", "═", "═", "╝" + RESET}};
            String b = scanner.nextLine();
            if (b.contains("w")) {
                if (c == 1) {
                    c = c + 1;
                }
                c = c - 1;
            } else if (b.contains("s")) {
                if (c == 5) {
                    c = c - 1;
                }
                c = c + 1;
            } else if (b.contains("d")) {
                if (r == 18) {
                    r = r - 1;
                }
                r = r + 1;
            } else if (b.contains("a")) {
                if (r == 1) {
                    r = r + 1;
                }
                r = r - 1;
            }
            e = e + 1;
            a[c][r] = RED + "p" + RESET;
            //Arrays.stream(a).map(Arrays::toString).forEach(System.out::println);
            System.out.println(
                    a[0][0] + a[0][1] + a[0][2] + a[0][3] + a[0][4] + a[0][5] + a[0][6] + a[0][7] +
                            a[0][8] + a[0][9] + a[0][10] + a[0][11] + a[0][12] + a[0][13] +
                            a[0][14] + a[0][15] + a[0][16] + a[0][17] + a[0][18] + a[0][19]);
            System.out.println(
                    a[1][0] + a[1][1] + a[1][2] + a[1][3] + a[1][4] + a[1][5] + a[1][6] + a[1][7] +
                            a[1][8] + a[1][9] + a[1][10] + a[1][11] + a[1][12] + a[1][13] +
                            a[1][14] + a[1][15] + a[1][16] + a[1][17] + a[1][18] + a[1][19]);
            System.out.println(
                    a[2][0] + a[2][1] + a[2][2] + a[2][3] + a[2][4] + a[2][5] + a[2][6] + a[2][7] +
                            a[2][8] + a[2][9] + a[2][10] + a[2][11] + a[2][12] + a[2][13] +
                            a[2][14] + a[2][15] + a[2][16] + a[2][17] + a[2][18] + a[2][19]);
            System.out.println(
                    a[3][0] + a[3][1] + a[3][2] + a[3][3] + a[3][4] + a[3][5] + a[3][6] + a[3][7] +
                            a[3][8] + a[3][9] + a[3][10] + a[3][11] + a[3][12] + a[3][13] +
                            a[3][14] + a[3][15] + a[3][16] + a[3][17] + a[3][18] + a[3][19]);
            System.out.println(
                    a[4][0] + a[4][1] + a[4][2] + a[4][3] + a[4][4] + a[4][5] + a[4][6] + a[4][7] +
                            a[4][8] + a[4][9] + a[4][10] + a[4][11] + a[4][12] + a[4][13] +
                            a[4][14] + a[4][15] + a[4][16] + a[4][17] + a[4][18] + a[4][19]);
            System.out.println(
                    a[5][0] + a[5][1] + a[5][2] + a[5][3] + a[5][4] + a[5][5] + a[5][6] + a[5][7] +
                            a[5][8] + a[5][9] + a[5][10] + a[5][11] + a[5][12] + a[5][13] +
                            a[5][14] + a[5][15] + a[5][16] + a[5][17] + a[5][18] + a[5][19]);
            System.out.println(
                    a[6][0] + a[6][1] + a[6][2] + a[6][3] + a[6][4] + a[6][5] + a[6][6] + a[6][7] +
                            a[6][8] + a[6][9] + a[6][10] + a[6][11] + a[6][12] + a[6][13] +
                            a[6][14] + a[6][15] + a[6][16] + a[6][17] + a[6][18] + a[6][19]);
        }
        System.err.println("tebrikler siz " + e + " addima kecdiniz");
    }
}
