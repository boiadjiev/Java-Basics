package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuelType = scanner.nextLine();
        double fuel = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();
        double totalPrice = 0;

        if ("Gas".equals(fuelType)) {
            totalPrice = fuel * 0.93;
            if (clubCard.equals("Yes")) {
                totalPrice = totalPrice - fuel * 0.08;
            }
        }
        if ("Gasoline".equals(fuelType)) {
            totalPrice = fuel * 2.22;
            if (clubCard.equals("Yes")) {
                totalPrice = totalPrice - fuel * 0.18;
            }
        }
        if ("Diesel".equals(fuelType)) {
            totalPrice = fuel * 2.33;
            if (clubCard.equals("Yes")) {
                totalPrice = totalPrice - fuel * 0.12;
            }
        }
        if (fuel > 20 && fuel <= 25) {
            totalPrice = totalPrice - totalPrice * 0.08;
        }
        if (fuel > 25) {
            totalPrice = totalPrice - totalPrice * 0.1;
        }

        System.out.printf("%.2f lv.", totalPrice);
    }
}
