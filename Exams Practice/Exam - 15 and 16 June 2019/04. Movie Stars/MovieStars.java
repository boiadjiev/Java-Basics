package Exam15and16June2019;

import java.util.Scanner;

public class MovieStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double payment;

        while (budget >= 0) {
            String name = scanner.nextLine();
            if(name.equals("ACTION")) {
                break;
            }
            if (name.length() <= 15) {
                payment = Double.parseDouble(scanner.nextLine());
            } else {
                payment = budget * 0.2;
            }
            budget -= payment;
        }

        if (budget < 0) {
            System.out.printf("We need %.2f leva for our actors.", Math.abs(budget));
        } else {
            System.out.printf("We are left with %.2f leva.", budget);
        }
    }
}
