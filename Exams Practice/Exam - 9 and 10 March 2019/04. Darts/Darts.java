package Exam9and10March2019;

import java.util.Scanner;

public class Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();
        int totalPoints = 301;
        int countSuccessShots = 0;
        int countUnsuccessShots = 0;
        boolean retire = false;

        while (totalPoints != 0) {
            String sector = scanner.nextLine();
            if (sector.equals("Retire")){
                retire = true;
                break;
            }
            int points = Integer.parseInt(scanner.nextLine());
            int shotPoint = 0;

            switch (sector) {
                case "Single":
                    shotPoint += points;
                    break;
                case "Double":
                    shotPoint += points * 2;
                    break;
                case "Triple":
                    shotPoint += points * 3;
                    break;
            }

            if (shotPoint > totalPoints) {
                countUnsuccessShots++;
                continue;
            } else {
                countSuccessShots++;
                totalPoints -= shotPoint;
            }
        }

        if (retire) {
            System.out.printf("%s retired after %d unsuccessful shots.", playerName, countUnsuccessShots);
        } else {
            System.out.printf("%s won the leg with %d shots.", playerName, countSuccessShots);
        }
    }
}
