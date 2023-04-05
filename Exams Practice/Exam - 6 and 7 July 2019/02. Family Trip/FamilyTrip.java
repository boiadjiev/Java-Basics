package Exam6and7July2019;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int percentExpenses = Integer.parseInt(scanner.nextLine());
        double total;

        if (nights > 7) {
            pricePerNight = pricePerNight - pricePerNight * 0.05;
        }
        
        double expenses = budget * percentExpenses / 100;
        total = nights * pricePerNight + expenses;
        double diff = Math.abs(budget - total);

        if (budget >= total) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", diff);
        } else {
            System.out.printf("%.2f leva needed.", diff);
        }
    }
}
