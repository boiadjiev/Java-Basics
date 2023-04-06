package Exam6and7July2019;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String beverage = scanner.nextLine();
        String sugar = scanner.nextLine();
        int beverageCount = Integer.parseInt(scanner.nextLine());
        double total = 0;
        switch (beverage) {
            case "Espresso":
                if ("Without".equals(sugar)) {
                    total = beverageCount * 0.9;
                } else if ("Normal".equals(sugar)) {
                    total = beverageCount;
                } else if ("Extra".equals(sugar)) {
                    total = beverageCount * 1.2;
                }
                if (beverageCount >= 5) {
                    total *= 0.75;
                }
                break;
            case "Cappuccino":
                if ("Without".equals(sugar)) {
                    total = beverageCount;
                } else if ("Normal".equals(sugar)) {
                    total = beverageCount * 1.2;
                } else if ("Extra".equals(sugar)) {
                    total = beverageCount * 1.6;
                }
                break;
            case "Tea":
                if ("Without".equals(sugar)) {
                    total = beverageCount * 0.5;
                } else if ("Normal".equals(sugar)) {
                    total = beverageCount * 0.6;
                } else if ("Extra".equals(sugar)) {
                    total = beverageCount * 0.7;
                }
                break;
        }
        if ("Without".equals(sugar)) {
            total *= 0.65;
        }
        if (total > 15) {
            total *= 0.8;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.", beverageCount, beverage, total);

    }
}
