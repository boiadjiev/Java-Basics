package Exam6and7April2019;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int walkOnCount = Integer.parseInt(scanner.nextLine());
        double clothingPrice = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;
        clothingPrice *= walkOnCount;

        if (walkOnCount > 150) {
            clothingPrice *= 0.9;
        }

        double total = decor + clothingPrice;

        if (total > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", total - budget);
        } else {
            System.out.println("Action!" );
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - total);
        }
    }
}
