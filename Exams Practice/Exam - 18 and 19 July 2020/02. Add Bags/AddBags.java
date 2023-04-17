package Exam18and19July2020;

import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double luggageOver20kgPrice = Double.parseDouble(scanner.nextLine());
        double luggageKg = Double.parseDouble(scanner.nextLine());
        int daysUntilTravel = Integer.parseInt(scanner.nextLine());
        int luggageCount = Integer.parseInt(scanner.nextLine());
        double luggageFee;

        if (luggageKg < 10) {
            luggageFee = luggageOver20kgPrice * 0.2;
        } else if (luggageKg <= 20) {
            luggageFee = luggageOver20kgPrice * 0.5;
        } else {
            luggageFee = luggageOver20kgPrice;
        }

        if (daysUntilTravel < 7) {
            luggageFee *= 1.4;
        } else if (daysUntilTravel <= 30) {
            luggageFee *= 1.15;
        } else {
            luggageFee *= 1.1;
        }

        System.out.printf("The total price of bags is: %.2f lv.", luggageCount * luggageFee);
    }
}
