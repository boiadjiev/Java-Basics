package Exam9and10March2019;

import java.util.Scanner;

public class GameNumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerOne = scanner.nextLine();
        String playerTwo = scanner.nextLine();
        String cardOne = scanner.nextLine();
        int playerOnePoints = 0;
        int playerTwoPoints = 0;

        while (!cardOne.equals("End of game")) {
            String cardTwo = scanner.nextLine();
            int one = Integer.parseInt(cardOne);
            int two = Integer.parseInt(cardTwo);

            if (one > two) {
                playerOnePoints += one - two;
            } else if (two > one) {
                playerTwoPoints += two - one;
            } else {
                one = Integer.parseInt(scanner.nextLine());
                two = Integer.parseInt(scanner.nextLine());
                System.out.println("Number wars!");
                if (one > two) {
                    System.out.printf("%s is winner with %d points", playerOne, playerOnePoints);
                } else {
                    System.out.printf("%s is winner with %d points", playerTwo, playerTwoPoints);
                }
                return;
            }
            cardOne = scanner.nextLine();
        }
        System.out.printf("%s has %d points\n", playerOne, playerOnePoints);
        System.out.printf("%s has %d points", playerTwo, playerTwoPoints);
    }
}
