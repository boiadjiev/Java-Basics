package Exam20and21April2019;

import java.util.Scanner;

public class EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int easterBreads = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        String winner = "";

        for (int i = 1; i <= easterBreads; i++) {
            String baker = scanner.nextLine();
            String input = scanner.nextLine();
            int points = 0;

            while (!input.equals("Stop")) {
                points += Integer.parseInt(input);
                input = scanner.nextLine();
            }
            System.out.printf("%s has %d points.\n", baker, points);

            if (points > max) {
                max = points;
                winner = baker;
                System.out.printf("%s is the new number 1!\n", baker);
            }
        }
        System.out.printf("%s won competition with %d points!", winner, max);
    }
}
