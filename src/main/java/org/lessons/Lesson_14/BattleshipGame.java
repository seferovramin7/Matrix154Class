package org.lessons.Lesson_14;

import java.util.*;

public class BattleshipGame {
    private static final int BOARD_SIZE = 10;
    private static final int SHIP_COUNT = 5;

    private char[][] playerBoard;
    private int shipsRemaining;
    private List<String> enemyBoats;

    public BattleshipGame() {
        playerBoard = new char[BOARD_SIZE][BOARD_SIZE];
        shipsRemaining = SHIP_COUNT;
        enemyBoats = new ArrayList<>();
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            Arrays.fill(playerBoard[i], ' ');
        }
    }

    public void placeEnemyBoats() {
        Random random = new Random();

        for (int i = 0; i < SHIP_COUNT; i++) {
            int row = random.nextInt(BOARD_SIZE);
            int col = random.nextInt(BOARD_SIZE);

            String boatLocation = row + "-" + col;
            if (enemyBoats.contains(boatLocation)) {
                i--;
                continue;
            }

            enemyBoats.add(boatLocation);
        }
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);

        while (shipsRemaining > 0) {
            displayBoard();
            System.out.print("Enter row (0-9): ");
            int row = scanner.nextInt();
            System.out.print("Enter column (0-9): ");
            int col = scanner.nextInt();

            if (row < 0 || row >= BOARD_SIZE || col < 0 || col >= BOARD_SIZE) {
                System.out.println("Invalid input! Try again.");
                continue;
            }

            String boatLocation = row + "-" + col;
            if (enemyBoats.contains(boatLocation)) {
                System.out.println("You hit an enemy boat!");
                playerBoard[row][col] = '!';
                enemyBoats.remove(boatLocation);
                shipsRemaining--;
            } else if (playerBoard[row][col] == '!' || playerBoard[row][col] == '-') {
                System.out.println("You already fired at this location!");
            } else {
                System.out.println("You missed!");
                playerBoard[row][col] = '-';
            }
        }

        System.out.println("Game over! You sunk all enemy boats!");
        displayBoard();
    }

    private void displayBoard() {
        System.out.println("\nPlayer's Board:");
        System.out.println("  0 1 2 3 4 5 6 7 8 9 ");
        for (int i = 0; i < BOARD_SIZE; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(playerBoard[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nEnemy's Boat Locations:");
        for (String boatLocation : enemyBoats) {
            System.out.println("Boat at: " + boatLocation);
        }
    }

    public static void main(String[] args) {
        BattleshipGame game = new BattleshipGame();
        game.placeEnemyBoats();
        game.playGame();
    }
}

