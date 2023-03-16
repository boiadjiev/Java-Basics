package ForLoop.Exercise;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournamentCount = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());
        int tournamentPoints = 0;
        int tournamentsWin = 0;

        for (int i = 0; i < tournamentCount; i++) {
            String stage = scanner.nextLine();

            switch (stage) {
                case "W":
                    tournamentPoints += 2000;
                    tournamentsWin++;
                    break;
                case "F":
                    tournamentPoints += 1200;
                    break;
                case "SF":
                    tournamentPoints += 720;
                    break;
            }
        }

        System.out.printf("Final points: %d\n", startPoints + tournamentPoints);
        System.out.printf("Average points: %.0f\n", Math.floor(tournamentPoints * 1.0 / tournamentCount));
        System.out.printf("%.2f%%", tournamentsWin * 1.0 / tournamentCount * 100);
    }
}
