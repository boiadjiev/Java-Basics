package Exam28and29March2020;

import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String set = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        double piece = 0;
        double total = 0;

        switch (fruit) {
            case "Watermelon":
                if (set.equals("small")) {
                    piece = 56;
                } else if (set.equals("big")) {
                    piece = 28.7;
                }
                break;

            case "Mango":
                if (set.equals("small")) {
                    piece = 36.66;
                } else if (set.equals("big")) {
                    piece = 19.6;
                }
                break;

            case "Pineapple":
                if (set.equals("small")) {
                    piece = 42.1;
                } else if (set.equals("big")) {
                    piece = 24.8;
                }
                break;

            case "Raspberry":
                if (set.equals("small")) {
                    piece = 20;
                } else if (set.equals("big")) {
                    piece = 15.2;
                }
        }
        if (set.equals("small")) {
            total = 2 * piece * count;
        } else if (set.equals("big")) {
            total = 5 * piece * count;
        }

        if (total >= 400 && total <= 1000) {
            total *= 0.85;
        } else if (total > 1000) {
            total *= 0.5;
        }
        System.out.printf("%.2f lv.", total);
    }
}
