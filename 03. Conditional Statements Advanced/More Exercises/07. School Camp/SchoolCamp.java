package ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;
public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        String group = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        String sport = "";
        double nightsPrice = 0;

        switch (season) {
            case "Winter" :
                if ("girls".equals(group)) {
                    sport = "Gymnastics";
                    nightsPrice = nights * 9.6;
                } else if ("boys".equals(group)) {
                    sport = "Judo";
                    nightsPrice = nights * 9.6;
                } else if ("mixed".equals(group)) {
                    sport = "Ski";
                    nightsPrice = nights * 10;
                }
                break;

            case "Spring" :
                if ("girls".equals(group)) {
                    sport = "Athletics";
                    nightsPrice = nights * 7.2;
                } else if ("boys".equals(group)) {
                    sport = "Tennis";
                    nightsPrice = nights * 7.2;
                } else if ("mixed".equals(group)) {
                    sport = "Cycling";
                    nightsPrice = nights * 9.5;
                }
                break;

            case "Summer" :
                if ("girls".equals(group)) {
                    sport = "Volleyball";
                    nightsPrice = nights * 15;
                } else if ("boys".equals(group)) {
                    sport = "Football";
                    nightsPrice = nights * 15;
                } else if ("mixed".equals(group)) {
                    sport = "Swimming";
                    nightsPrice = nights * 20;
                }
                break;
        }

        double total = students * nightsPrice;

        if (students >= 50) {
            total *= 0.5;
        }
        if (students >= 20 && students < 50) {
            total *= 0.85;
        }
        if (students >= 10 && students < 20) {
            total *= 0.95;
        }

        System.out.printf("%s %.2f lv.", sport, total);
    }
}
