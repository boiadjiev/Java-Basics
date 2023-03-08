package ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String accommodation = "";
        String location = "";
        double price = 0;

        if (budget <= 1000) {
            accommodation = "Camp";
            if ("Summer".equals(season)) {
                price = budget * 0.65;
            } else if ("Winter".equals(season)) {
                price = budget * 0.45;
            }
        }
        if (budget > 1000 && budget <= 3000) {
            accommodation = "Hut";
            if ("Summer".equals(season)) {
                price = budget * 0.8;
            } else if ("Winter".equals(season)) {
                price = budget * 0.6;
            }
        }
        if (budget > 3000) {
            accommodation = "Hotel";
            price = budget * 0.9;
        }

        if ("Summer".equals(season)) {
            location = "Alaska";
        } else if ("Winter".equals(season)) {
            location = "Morocco";
        }

        System.out.printf("%s - %s - %.2f", location, accommodation, price);
    }
}
