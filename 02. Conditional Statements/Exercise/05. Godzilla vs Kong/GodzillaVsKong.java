package ConditionalStatements.Exercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int walkOnCount = Integer.parseInt(scanner.nextLine());
        double clothingPrice = Double.parseDouble(scanner.nextLine());
        double decorAmount = budget * 0.1;
        clothingPrice = clothingPrice * walkOnCount;
        if (walkOnCount > 150) {
            clothingPrice = clothingPrice - clothingPrice * 0.1;
        }
        double money = Math.abs(budget - (clothingPrice + decorAmount));
        if (budget < (clothingPrice + decorAmount)) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", money);
        } else if (budget >= (clothingPrice + decorAmount)) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", money);
        }
    }
}
