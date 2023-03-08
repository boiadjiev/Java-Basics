package ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String classCar = "";
        double carPrice = 0;
        String carType = "";

        if (budget <= 100) {
            classCar = "Economy class";
            if ("Summer".equals(season)) {
                carType = "Cabrio";
                carPrice = budget * 0.35;
            } else if ("Winter".equals(season)) {
                carType = "Jeep";
                carPrice = budget * 0.65;
            }
        }
        if (budget > 100 && budget <= 500) {
            classCar = "Compact class";
            if ("Summer".equals(season)) {
                carType = "Cabrio";
                carPrice = budget * 0.45;
            } else if ("Winter".equals(season)) {
                carType = "Jeep";
                carPrice = budget * 0.8;
            }
        }
        if (budget > 500) {
            classCar = "Luxury class";
            carType = "Jeep";
            carPrice = budget * 0.9;
        }
        System.out.println(classCar);
        System.out.printf("%s - %.2f", carType, carPrice);
    }
}
