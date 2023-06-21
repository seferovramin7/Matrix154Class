package org.lessons.Lesson_11;

import java.util.Random;
import java.util.Scanner;

public class LeylaMazeSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(11) + 10;

        char maze[][] = new char[number][number];
        for (int i = 0; i < maze.length; i++) { //row
            for (int j = 0; j < maze.length; j++) { //column
                maze[i][j] = ' ';
            }
        }
        for (int k = 0; k < maze.length; k++) {
            maze[0][k] = '#'; //uzunluq istiqametinde
            maze[k][0] = '#'; //en istiqametinde
            maze[k][maze.length - 1] = '#';
            maze[maze.length - 1][k] = '#';

        }
        int r = random.nextInt(number);
        int re = random.nextInt(number);
        int column = 1;
        maze[r][column] = 'P';
        maze[re][maze.length - 1] = 'E';


        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Welcome to the Maze Game! Let's start!");
        boolean playAgain = false;
        while (!playAgain) {
            System.out.println("Enter your direction: (up/down/left/right)");
            String command = scanner.nextLine();
            if (command.equals("up")) {
                r = r - 1;
            } else if (command.equals("down")) {
                r = r + 1;
            } else if (command.equals("right")) {
                column = column + 1;
            } else if (command.equals("left")) {
                column = column - 1;
            }
            System.out.println("Result your direction: ");
            for (int i = 0; i < maze.length; i++) {
                for (int j = 0; j < maze.length; j++) {
                    maze[r][column] = 'P';
                    System.out.print(maze[i][j] + " ");
                }
                System.out.println();
            }
            break;
        }
    }
}
