package RetakeExam2and3May2019;

import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String productName = scanner.nextLine();
        int count = 0;
        double total = 0;

        while (!productName.equals("Stop")) {
            double productPrice = Double.parseDouble(scanner.nextLine());
            count++;

            if (count % 3 == 0) {
                productPrice /= 2;
            }

            if (budget < productPrice) {
                System.out.printf("You don't have enough money!\nYou need %.2f leva!", productPrice - budget);
                return;
            }

            total += productPrice;
            budget -= productPrice;
            productName = scanner.nextLine();
        }

        System.out.printf("You bought %d products for %.2f leva.", count, total);
    }
}
