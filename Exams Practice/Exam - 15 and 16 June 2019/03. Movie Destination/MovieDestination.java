package Exam15and16June2019;

import java.util.Scanner;

public class MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double pricePerDay = 0;
        double total;

        switch(destination) {
            case "Dubai":
                if (season.equals("Winter")) {
                    pricePerDay = 45000;
                } else if(season.equals("Summer")) {
                    pricePerDay = 40000;
                }
                break;

            case "Sofia":
                if (season.equals("Winter")) {
                    pricePerDay = 17000;
                } else if(season.equals("Summer")) {
                    pricePerDay = 12500;
                }
                break;

            case "London":
                if (season.equals("Winter")) {
                    pricePerDay = 24000;
                } else if(season.equals("Summer")) {
                    pricePerDay = 20250;
                }
                break;
        }
        total = days * pricePerDay;

        if (destination.equals("Dubai")) {
            total *= 0.7;
        }else if (destination.equals("Sofia")) {
            total *= 1.25;
        }

        if (budget >= total) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget - total);
        } else {
            System.out.printf("The director needs %.2f leva more!", total - budget);
        }
    }
}
