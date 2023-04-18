package Exam18and19July2020;

import java.util.Scanner;

public class AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String delivery = scanner.nextLine();
        double total = 0;

        switch (type) {
            case "90X130":
                total = 110 * count;
                if (count > 60) {
                    total *= 0.92;
                } else if (count > 30) {
                    total *= 0.95;
                }
                break;

            case "100X150":
                total = 140 * count;
                if (count > 80) {
                    total *= 0.9;
                } else if (count > 40) {
                    total *= 0.94;
                }
                break;

            case "130X180":
                total = 190 * count;
                if (count > 50) {
                    total *= 0.88;
                } else if (count > 20) {
                    total *= 0.93;
                }
                break;

            case "200X300":
                total = 250 * count;
                if (count > 50) {
                    total *= 0.86;
                } else if (count > 25) {
                    total *= 0.91;
                }
                break;
        }
        if (delivery.equals("With delivery")) {
            total += 60;
        }

        if (count > 99) {
            total *= 0.96;
        }

        if (count < 10) {
            System.out.println("Invalid order");
        } else {
            System.out.printf("%.2f BGN", total);
        }
    }
}
