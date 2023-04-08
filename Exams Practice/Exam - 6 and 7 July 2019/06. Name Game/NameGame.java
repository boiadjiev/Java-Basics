package Exam6and7July2019;

import java.util.Scanner;

public class NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int maxPoints = Integer.MIN_VALUE;
        String winner = "";

        while (!name.equals("Stop")) {

            int points = 0;
            for (int i = 0; i < name.length(); i++) {

                int input = Integer.parseInt(scanner.nextLine());
                if (input == name.charAt(i)) {
                    points += 10;
                } else {
                    points += 2;
                }
            }
            if (points > maxPoints) {
                maxPoints = points;
            }
            if (points == maxPoints) {
                winner = name;
            }
            name = scanner.nextLine();
        }
        System.out.printf("The winner is %s with %d points!", winner, maxPoints);
    }
}
