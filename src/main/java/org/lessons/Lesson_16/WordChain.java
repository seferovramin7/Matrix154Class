package org.lessons.Lesson_16;

import java.util.Scanner;

interface Game {
    void initialize();
    void play();
    boolean isGameOver();
}

class WordChainGame implements Game {
    private String startingWord;
    private String currentWord;
    private boolean gameWon;
    private Scanner scanner;

    @Override
    public void initialize() {
        scanner = new Scanner(System.in);
        System.out.print("Enter the starting word: ");
        startingWord = scanner.nextLine();
        currentWord = startingWord;
        gameWon = false;
    }

    @Override
    public void play() {
        System.out.println("Starting word: " + startingWord);

        while (!gameWon) {
            System.out.print("Enter a word that starts with the last letter of '" + currentWord + "': ");
            String word = scanner.nextLine();

            if (isWordValid(word)) {
                updateCurrentWord(word);
                if (isGameOver()) {
                    gameWon = true;
                    System.out.println("Congratulations! You completed the word chain.");
                }
            } else {
                System.out.println("Invalid word. Try again.");
            }
        }
    }

    private boolean isWordValid(String word) {
        if (word.isEmpty()) {
            return false;
        }

        char lastChar = currentWord.charAt(currentWord.length() - 1);
        char firstChar = word.charAt(0);
        return Character.toLowerCase(lastChar) == Character.toLowerCase(firstChar);
    }

    private void updateCurrentWord(String word) {
        currentWord = word;
        System.out.println("Current word: " + currentWord);
    }

    @Override
    public boolean isGameOver() {
        return currentWord.equalsIgnoreCase(startingWord);
    }
}

 class Main {
    public static void main(String[] args) {
        Game wordChainGame = new WordChainGame();
        wordChainGame.initialize();
        wordChainGame.play();
    }
}

