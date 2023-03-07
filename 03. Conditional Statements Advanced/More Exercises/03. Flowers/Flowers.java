package ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String isHoliday = scanner.nextLine();
        double total = 0;

        switch (season) {
            case "Spring":
            case "Summer":
                total = chrysanthemums * 2.0 + roses * 4.1 + tulips * 2.5;
                break;
            case "Autumn":
            case "Winter":
                total = chrysanthemums * 3.75 + roses * 4.5 + tulips * 4.15;
                break;
        }
        if ("Y".equals(isHoliday)) {
            total *= 1.15;
        }
        if (tulips > 7 && "Spring".equals(season)) {
            total *= 0.95;
        }
        if (roses >= 10 && "Winter".equals(season)) {
            total *= 0.9;
        }
        if ((chrysanthemums + roses + tulips) > 20) {
            total *= 0.8;
        }
        System.out.printf("%.2f", total + 2);
    }
}
