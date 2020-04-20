package fi.company;

import java.util.Scanner;

public class Game {

    public static String player;
    public static String computer;

    public static void gameStart() {

            int computerScore = 0;
            int playerScore = 0;
            int rounds = 3;


            // Welcoming message
            System.out.println("Welcome to the rock, paper, scissors game! - BEST OF 3 - ");
            while (playerScore < 2 && computerScore < 2) {

                    // Users choice
                    Scanner scanner = new Scanner(System.in);
                        System.out.println("ROCK / PAPER / SCISSORS");
                        String player = scanner.nextLine();
                        player = player.toUpperCase();
                    System.out.println("Player: " + player);

                    // Computers choice
                    // number hold 0, 1 or 2.
                    int number = (int) (Math.random() * 3);

                    if (number == 0) { computer = "ROCK"; }
                    if (number == 1) { computer = "PAPER"; }
                    if (number == 2) { computer = "SCISSORS"; }
                    System.out.println("Computer: " + computer);

                    // POINTS
                    if (player.equals(computer)) {
                        System.out.println("It's a Tie!");
                    }
                    if (player.equals("ROCK") && computer.equals("SCISSORS")) {
                        System.out.println("You Win!");
                        playerScore = playerScore + 1;
                        rounds = rounds - 1;
                        System.out.println("Player points: " + playerScore);
                    }
                    if (player.equals("ROCK") && computer.equals("PAPER")) {
                        System.out.println("You Lose!");
                        computerScore = computerScore + 1;
                        rounds = rounds - 1;
                        System.out.println("Computer points: " + computerScore);

                    }
                    if (player.equals("PAPER") && computer.equals("ROCK")) {
                        System.out.println("You Win!");
                        playerScore = playerScore + 1;
                        rounds = rounds - 1;
                        System.out.println("Player points: " + playerScore);
                    }

                    if (player.equals("PAPER") && computer.equals("SCISSORS")) {
                        System.out.println("You Lose!");
                        computerScore = computerScore + 1;
                        rounds = rounds - 1;
                        System.out.println("Computer points: " + computerScore);

                    }
                    if (player.equals("SCISSORS") && computer.equals("PAPER")) {
                        System.out.println("You Win!");
                        playerScore = playerScore + 1;
                        rounds = rounds - 1;
                        System.out.println("Player points: " + playerScore);

                    }
                    if (player.equals("SCISSORS") && computer.equals("ROCK")) {
                        System.out.println("You Lose!");
                        computerScore = computerScore + 1;
                        rounds = rounds - 1;
                        System.out.println("Computer points: " + computerScore);
                    }
                }

                // PRINTING THE RESULTS
                System.out.println("Game has ended.");
                System.out.println("Player: " + playerScore + " points");
                System.out.println("Computer: " + computerScore + " points");
                if (playerScore > computerScore) {
                    System.out.println("You win the game, congrats!");
                } else {
                    System.out.println("You lose, better luck next time!");
                }

                // CONTINUE GAME OR NOT?
                System.out.println("Wanna play again, Yes or No?");
                Scanner scanner = new Scanner(System.in);
                String choose = scanner.nextLine();
                choose = choose.toUpperCase();
                if (choose.equals("YES")) {
                    gameStart();
                }
                if (choose.equals("NO")) {
                    System.out.println("Thank you for playing!");
                }
    }
}
