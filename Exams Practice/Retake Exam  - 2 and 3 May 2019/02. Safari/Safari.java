package RetakeExam2and3May2019;

import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double fuel = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        double total = fuel * 2.1 + 100;

        if(day.equals("Saturday")) {
            total *= 0.9;
        } else {
            total *= 0.8;
        }

        if (budget >= total) {
            System.out.printf("Safari time! Money left: %.2f lv.", budget - total);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", total - budget);
        }
    }
}
