package Exam20and21April2019;

import java.util.Scanner;

public class EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eggsOne = Integer.parseInt(scanner.nextLine());
        int eggsTwo = Integer.parseInt(scanner.nextLine());
        String winner = scanner.nextLine();

        while (!winner.equals("End")) {

            switch (winner) {
                case "one":
                    eggsTwo--;
                    break;
                case "two":
                    eggsOne--;
            }
            if (eggsOne == 0) {
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.", eggsTwo);
                return;
            }
            if (eggsTwo == 0) {
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.", eggsOne);
                return;
            }
            winner = scanner.nextLine();
        }
        System.out.printf("Player one has %d eggs left.\nPlayer two has %d eggs left.", eggsOne, eggsTwo);
    }
}
