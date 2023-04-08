package Exam6and7July2019;

import java.util.Scanner;

public class FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String team = scanner.nextLine();
        int match = Integer.parseInt(scanner.nextLine());
        int countW = 0;
        int countD = 0;
        int countL = 0;

        for (int i = 1; i <= match; i++) {
            String result = scanner.nextLine();

            switch (result) {
                case "W":
                    countW++;
                    break;
                case "D":
                    countD++;
                    break;
                case "L":
                    countL++;
                    break;
            }
        }
        if (match == 0) {
            System.out.printf("%s hasn't played any games during this season.", team);
        } else {
            System.out.printf("%s has won %d points during this season.\n", team, countW * 3 + countD);
            System.out.printf("Total stats:\n## W: %d\n## D: %d\n## L: %d\n", countW, countD, countL);
            System.out.printf("Win rate: %.2f%%", countW * 1.0 / match * 100);
        }
    }
}
