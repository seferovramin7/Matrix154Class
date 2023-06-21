package org.lessons.Lesson_11;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class MazeGame extends JFrame {
    private int maze[][]; // 2D array to hold the maze
    private int rows, cols; // dimensions of the maze
    private int playerX, playerY; // player position in the maze
    private boolean gameover; // flag to indicate game over

    public MazeGame(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.maze = new int[rows][cols];

        // Initialize the maze with random walls
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                maze[i][j] = rand.nextInt(2); // 0 = open, 1 = wall
            }
        }

        // Place the player at a random open spot
        do {
            playerX = rand.nextInt(rows);
            playerY = rand.nextInt(cols);
        } while (maze[playerX][playerY] == 1);

        // Create the game window
        setTitle("Maze Game");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add a key listener to move the player
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    movePlayer(-1, 0);
                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    movePlayer(1, 0);
                } else if (e.getKeyCode() == KeyEvent.VK_UP) {
                    movePlayer(0, -1);
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    movePlayer(0, 1);
                }
            }
        });

        setVisible(true);
    }

    private void movePlayer(int dx, int dy) {
        // Check if the move is valid
        int newX = playerX + dx;
        int newY = playerY + dy;
        if (newX >= 0 && newX < rows && newY >= 0 && newY < cols && maze[newX][newY] == 0) {
            // Move the player
            playerX = newX;
            playerY = newY;
            repaint();
            // Check if the player has reached the end of the maze
            if (playerX == rows - 1 && playerY == cols - 1) {
                gameover = true;
                JOptionPane.showMessageDialog(this, "Congratulations, you won!");
            }
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        // Draw the maze
        int cellSize = 20;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (maze[i][j] == 1) {
                    g.setColor(Color.BLACK);
                    g.fillRect(j * cellSize, i * cellSize, cellSize, cellSize);
                } else {
                    g.setColor(Color.WHITE);
                    g.fillRect(j * cellSize, i * cellSize, cellSize, cellSize);
                }
            }
        }
        // Draw the player
        g.setColor(Color.RED);
        g.fillOval(playerY * cellSize, playerX * cellSize, cellSize, cellSize);
    }

    public static void main(String[] args) {
        MazeGame game = new MazeGame(20, 20); // create a new game with a 20x20 maze
    }
}
