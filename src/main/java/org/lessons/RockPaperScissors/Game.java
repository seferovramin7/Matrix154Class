package org.lessons.RockPaperScissors;

import java.util.Scanner;

public class Game {
    private Player player1;
    private Player player2;
    private int round;

    public Game(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
        round = 1;
    }

    public void playRound() {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Round %d\n", round);
        System.out.printf("%s's turn: ", player1.getName());
        player1.setChoice(sc.next().toLowerCase());
        player2.setChoice(getComputerChoice());

        String result = calculateResult(player1.getChoice(), player2.getChoice());
        System.out.printf("%s chose %s, %s chose %s. Result: %s\n",
                player1.getName(), player1.getChoice(),
                player2.getName(), player2.getChoice(),
                result);

        updateScore(result);
        round++;
    }

    private String getComputerChoice() {
        int choiceIndex = (int) (Math.random() * 3);
        String[] choices = {"rock", "paper", "scissors"};
        return choices[choiceIndex];
    }

    private String calculateResult(String choice1, String choice2) {
        if (choice1.equals(choice2)) {
            return "tie";
        } else {
            switch (choice1) {
                case "rock":
                    return choice2.equals("scissors") ? "win" : "lose";
                case "paper":
                    return choice2.equals("rock") ? "win" : "lose";
                case "scissors":
                    return choice2.equals("paper") ? "win" : "lose";
                default:
                    return "invalid input";
            }
        }
    }

    private void updateScore(String result) {
        switch (result) {
            case "win":
                player1.setScore(player1.getScore() + 1);
                break;
            case "lose":
                player2.setScore(player2.getScore() + 1);
                break;
            case "tie":
                break;
            default:
                System.out.println("Invalid result.");
        }
    }

    public void playGame() {
        Scanner sc = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            playRound();
            System.out.printf("Score after round %d: %s %d, %s %d\n",
                    round - 1, player1.getName(), player1.getScore(),
                    player2.getName(), player2.getScore());
            System.out.print("Play again? (y/n): ");
            playAgain = sc.next().equalsIgnoreCase("y");
        }

        System.out.println("Game over.");
        if (player1.getScore() > player2.getScore()) {
            System.out.printf("%s wins!\n", player2.getName());
        } else if (player1.getScore() < player2.getScore()) {
            System.out.printf("%s wins!\n", player2.getName());
        } else {
            System.out.println("It's a tie!");
        }
    }
}

