import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int crapsRoll = die1 + die2;

            System.out.println();
            System.out.println("Rolling the dice...");
            System.out.println();
            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("Total: " + crapsRoll);

            if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12) {
                System.out.println();
                System.out.println("Craps! You lose!");
            } else if (crapsRoll == 7 || crapsRoll == 11) {
                System.out.println();
                System.out.println("Natural! You win!");
            } else {
                System.out.println();
                System.out.println("Point is " + crapsRoll);
                boolean pointMade = false;

                while (true) {
                    int nextDie1 = rnd.nextInt(6) + 1;
                    int nextDie2 = rnd.nextInt(6) + 1;
                    int nextRoll = nextDie1 + nextDie2;

                    System.out.println();
                    System.out.println("Rolling the dice again...");
                    System.out.println();
                    System.out.println("Die 1: " + nextDie1);
                    System.out.println("Die 2: " + nextDie2);
                    System.out.println("Total: " + nextRoll);

                    if (nextRoll == crapsRoll) {
                        System.out.println();
                        System.out.println("Made the point! You win!");
                        pointMade = true;
                        break;
                    } else if (nextRoll == 7) {
                        System.out.println();
                        System.out.println("Got a seven and lost!");
                        break;
                    }
                }

                if (!pointMade) {
                    System.out.println();
                    System.out.println("Point not made. You lose!");
                }
            }
            System.out.println();
            System.out.print("Play again? (y/n): ");
            String playAgainInput = in.next().toLowerCase();
            playAgain = playAgainInput.equals("y");
        }
    }
}