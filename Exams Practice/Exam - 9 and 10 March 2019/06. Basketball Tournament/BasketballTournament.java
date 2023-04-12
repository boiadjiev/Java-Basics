package Exam9and10March2019;

import java.util.Scanner;

public class BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tournament = scanner.nextLine();
        int gameCountTotal = 0;
        int winCount = 0;
        int lostCount = 0;

        while (!tournament.equals("End of tournaments")) {
            int n = Integer.parseInt(scanner.nextLine());
            int gameCount = 0;

            for (int i = 1; i <= n; i++) {
                int teamOne = Integer.parseInt(scanner.nextLine());
                int teamTwo = Integer.parseInt(scanner.nextLine());
                gameCount++;
                gameCountTotal++;

                if (teamOne > teamTwo) {
                    winCount++;
                    System.out.printf("Game %d of tournament %s: win with %d points.\n", gameCount, tournament, teamOne - teamTwo);
                } else if (teamTwo > teamOne) {
                    lostCount++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.\n", gameCount, tournament, teamTwo - teamOne);
                }
            }
            tournament = scanner.nextLine();
        }
        System.out.printf("%.2f%% matches win\n", winCount * 1.0 / gameCountTotal * 100);
        System.out.printf("%.2f%% matches lost", lostCount * 1.0 / gameCountTotal * 100);
    }
}
