package RetakeExam2and3May2019;

import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String duration = scanner.nextLine();
        String type = scanner.nextLine();
        String net = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());
        double total = 0;

        switch (type) {
            case "Small":
                if (duration.equals("one")) {
                    total += 9.98;
                } else {
                    total += 8.58;
                }
                break;

            case "Middle":
                if (duration.equals("one")) {
                    total += 18.99;
                } else {
                    total += 17.09;
                }
                break;

            case "Large":
                if (duration.equals("one")) {
                    total += 25.98;
                } else {
                    total += 23.59;
                }
                break;

            case "ExtraLarge":
                if (duration.equals("one")) {
                    total += 35.99;
                } else {
                    total += 31.79;
                }
                break;
        }

        if (net.equals("yes")) {

            if (total <= 10) {
                total += 5.5;
            } else if (total <= 30) {
                total += 4.35;
            } else {
                total += 3.85;
            }
        }

        if (duration.equals("two")) {
            total *= 0.9625;
        }

        System.out.printf("%.2f lv.", total * 1.0 * months);
    }
}
