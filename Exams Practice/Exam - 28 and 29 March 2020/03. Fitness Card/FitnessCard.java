package Exam28and29March2020;

import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();
        double cardPrice = 0;

        switch (sport) {
            case "Gym":
                if (gender.equals("m")) {
                    cardPrice = 42;
                } else if (gender.equals("f")) {
                    cardPrice = 35;
                }
                break;

            case "Boxing":
                if (gender.equals("m")) {
                    cardPrice = 41;
                } else if (gender.equals("f")) {
                    cardPrice = 37;
                }
                break;

            case "Yoga":
                if (gender.equals("m")) {
                    cardPrice = 45;
                } else if (gender.equals("f")) {
                    cardPrice = 42;
                }
                break;

            case "Zumba":
                if (gender.equals("m")) {
                    cardPrice = 34;
                } else if (gender.equals("f")) {
                    cardPrice = 31;
                }
                break;

            case "Dances":
                if (gender.equals("m")) {
                    cardPrice = 51;
                } else if (gender.equals("f")) {
                    cardPrice = 53;
                }
                break;

            case "Pilates":
                if (gender.equals("m")) {
                    cardPrice = 39;
                } else if (gender.equals("f")) {
                    cardPrice = 37;
                }
        }
        if (age <= 19) {
            cardPrice *= 0.8;
        }
        if (sum >= cardPrice) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.", cardPrice - sum);
        }
    }
}
