package org.lessons.Lesson_10;

import java.util.Random;
import java.util.Scanner;

public class MazeGame {
    private char[][] maze;
    private int playerRow;
    private int playerCol;
    private int endRow;
    private int endCol;
    private int score;

    public MazeGame() {
        Random random = new Random();
        int size = 10 + random.nextInt(10); // Generate a random size for the maze
        maze = new char[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row == 0 || col == 0 || row == size - 1 || col == size - 1) {
                    maze[row][col] = '#'; // Create walls around the border of the maze
                } else {
                    maze[row][col] = ' '; // Create an empty path for the maze
                }
            }
        }
        // Place the player and end point randomly in the maze
        playerRow = random.nextInt(size - 2) + 1;
        playerCol = random.nextInt(size - 2) + 1;
        maze[playerRow][playerCol] = 'P';
        endRow = random.nextInt(size - 2) + 1;
        endCol = random.nextInt(size - 2) + 1;
        maze[endRow][endCol] = 'E';
        score = 0;
    }

    public static void main(String[] args) {
        MazeGame game = new MazeGame();
        game.play();
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
            printMaze();

        while (true) {
//            printMaze();
//            System.out.print("Score: " + score + ". Enter a direction (up/down/left/right): ");
//            String input = scanner.nextLine();
//            int newRow = playerRow;
//            int newCol = playerCol;
//            switch (input) {
//                case "up":
//                    newRow--;
//                    break;
//                case "down":
//                    newRow++;
//                    break;
//                case "left":
//                    newCol--;
//                    break;
//                case "right":
//                    newCol++;
//                    break;
//                default:
//                    System.out.println("Invalid direction. Please enter up/down/left/right.");
//                    continue;
//            }
//            if (maze[newRow][newCol] == '#') {
//                System.out.println("You cannot move in that direction.");
//                continue;
//            }
//            score++;
//            if (maze[newRow][newCol] == 'E') {
//                System.out.println("Congratulations! You have won the game.");
//                break;
//            }
//            maze[playerRow][playerCol] = ' ';
//            playerRow = newRow;
//            playerCol =
//
//                    newCol;
//            maze[playerRow][playerCol] = 'P';
//        }
//        scanner.close();
        }
    }

    private void printMaze() {
        for (int row = 0; row < maze.length; row++) {
            for (int col = 0; col < maze[row].length; col++) {
                System.out.print(maze[row][col]);
            }
            System.out.println();
        }
    }
}