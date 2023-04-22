package Exam20and21April2019;

import java.util.Scanner;

public class EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int customers = Integer.parseInt(scanner.nextLine());
        double total = 0;

        for (int i = 0; i < customers; i++) {
            String purchase = scanner.nextLine();
            double totalPerCustomer = 0;
            int count = 0;

            while (!purchase.equals("Finish")) {

                switch (purchase) {
                    case "basket":
                        totalPerCustomer += 1.5;
                        break;
                    case "wreath":
                        totalPerCustomer += 3.8;
                        break;
                    case "chocolate bunny":
                        totalPerCustomer += 7;
                }
                count++;
                purchase = scanner.nextLine();
            }
            if (count % 2 == 0) {
                totalPerCustomer *= 0.8;
            }
            total += totalPerCustomer;
            System.out.printf("You purchased %d items for %.2f leva.\n", count, totalPerCustomer);
        }
        System.out.printf("Average bill per client is: %.2f leva.", total / customers);
    }
}
