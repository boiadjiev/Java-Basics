package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = "";
        double expenses = 0;
        String hotelOrCamp;

        if (budget <= 100) {
            place = "Bulgaria";
            if ("summer".equals(season)) {
                expenses = budget * 0.3;
            } else if ("winter".equals(season)) {
                expenses = budget * 0.7;
            }
        } else if (budget <= 1000) {
            place = "Balkans";
            if ("summer".equals(season)) {
                expenses = budget * 0.4;
            } else if ("winter".equals(season)) {
                expenses = budget * 0.8;
            }
        } else if (budget > 1000) {
            place = "Europe";
            expenses = budget * 0.9;
        }

        if ("Europe".equals(place)) {
            hotelOrCamp = "Hotel";
        } else if ("summer".equals(season)) {
            hotelOrCamp = "Camp";
        } else {
            hotelOrCamp = "Hotel";
        }

        System.out.printf("Somewhere in %s\n", place);
        System.out.printf("%s - %.2f", hotelOrCamp, expenses);
    }
}
