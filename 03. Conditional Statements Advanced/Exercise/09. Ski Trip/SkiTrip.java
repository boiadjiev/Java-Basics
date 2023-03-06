package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysToStay = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String evaluation = scanner.nextLine();
        double price = 0;

        if ("room for one person".equals(roomType)) {
            price = (daysToStay - 1) * 18;
        } else if ("apartment".equals(roomType)) {
            price = (daysToStay - 1) * 25;
        } else if ("president apartment".equals(roomType)) {
            price = (daysToStay - 1) * 35;
        }

        switch (roomType) {
            case "apartment":
                if (daysToStay < 10) {
                    price *= 0.7;
                }
                if (daysToStay >= 10 && daysToStay <= 15) {
                    price *= 0.65;
                }
                if (daysToStay > 15) {
                    price *= 0.5;
                }
                break;

            case "president apartment":
                if (daysToStay < 10) {
                    price *= 0.9;
                }
                if (daysToStay >= 10 && daysToStay <= 15) {
                    price *= 0.85;
                }
                if (daysToStay > 15) {
                    price *= 0.8;
                }
                break;
         }

        if ("positive".equals(evaluation)) {
            price *= 1.25;
        } else {
            price *= 0.9;
        }

        System.out.printf("%.2f", price);
    }
}
