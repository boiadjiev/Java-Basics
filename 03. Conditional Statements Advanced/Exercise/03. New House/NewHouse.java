package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowersType = scanner.nextLine();
        int flowersCount  = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double total = 0;

        switch (flowersType) {
            case "Roses":
                total = flowersCount * 5.0;
                if (flowersCount > 80) {
                    total *= 0.9;
                }
                break;

            case "Dahlias":
                total = flowersCount * 3.8;
                if (flowersCount > 90) {
                    total *= 0.85;
                }
                break;

            case "Tulips":
                total = flowersCount * 2.8;
                if (flowersCount > 80) {
                    total *= 0.85;
                }
                break;

            case "Narcissus":
                total = flowersCount * 3.0;
                if (flowersCount < 120) {
                   total *= 1.15;
                }
                break;

            case "Gladiolus":
                total = flowersCount * 2.5;
                if (flowersCount < 80) {
                    total *= 1.2;
                }
                break;
        }

        double diff = Math.abs(budget - total);

        if (budget >= total) {
            System.out.printf("Hey, you have a great garden with %s %s and %.2f leva left.", flowersCount, flowersType, diff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }
}
