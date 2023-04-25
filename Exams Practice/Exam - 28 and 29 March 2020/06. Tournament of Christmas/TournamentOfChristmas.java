package Exam28and29March2020;

import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int winCount = 0;
        int loseCount = 0;
        double totalMoney = 0;

        for (int i = 0; i < days; i++) {

            String sport = scanner.nextLine();
            double moneyPerDay = 0;
            int winDayCount = 0;
            int loseDayCount = 0;

            while (!sport.equals("Finish")) {
                String result = scanner.nextLine();

                if (result.equals("win")) {
                    winCount++;
                    winDayCount++;
                    moneyPerDay += 20;
                } else if (result.equals("lose")) {
                    loseCount++;
                    loseDayCount++;
                }
                sport = scanner.nextLine();
            }
            if (winDayCount > loseDayCount) {
                moneyPerDay *= 1.1;
            }
            totalMoney += moneyPerDay;
        }
        if (winCount > loseCount) {
            totalMoney *= 1.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoney);
        }
    }
}
