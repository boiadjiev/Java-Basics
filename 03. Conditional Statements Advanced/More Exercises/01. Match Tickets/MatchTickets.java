package ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;
public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());
        double ticket = 0;
        double transport = 0;

        if ("VIP".equals(category)) {
            ticket = 499.99;
        } else if ("Normal".equals(category)) {
            ticket = 249.99;
        }

        if (people >= 1 && people <= 4) {
            transport = budget * 0.75;
        } else if (people >= 5 && people <= 9) {
            transport = budget * 0.6;
        } else if (people >= 10 && people <= 24) {
            transport = budget * 0.5;
        } else if (people >= 25 && people <= 49) {
            transport = budget * 0.4;
        } else if (people >= 50) {
            transport = budget * 0.25;
        }

        double remaining = budget - transport;
        double ticketsPrice = ticket * people;

        if (remaining >= ticketsPrice) {
            System.out.printf("Yes! You have %.2f leva left.", remaining - ticketsPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", ticketsPrice - remaining);
        }
    }
}
