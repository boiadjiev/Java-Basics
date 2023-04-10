package Exam9and10March2019;

import java.util.Scanner;

public class Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        String apparatus = scanner.nextLine();
        double difficulty = 0;
        double performance = 0;

        switch (country) {
            case "Russia":
                if (apparatus.equals("ribbon")) {
                    difficulty = 9.1;
                    performance = 9.4;
                } else if (apparatus.equals("hoop")) {
                    difficulty = 9.3;
                    performance = 9.8;
                } else if (apparatus.equals("rope")) {
                    difficulty = 9.6;
                    performance = 9;
                }
                break;

            case "Bulgaria":
                if (apparatus.equals("ribbon")) {
                    difficulty = 9.6;
                    performance = 9.4;
                } else if (apparatus.equals("hoop")) {
                    difficulty = 9.55;
                    performance = 9.75;
                } else if (apparatus.equals("rope")) {
                    difficulty = 9.5;
                    performance = 9.4;
                }
                break;

            case "Italy":
                if (apparatus.equals("ribbon")) {
                    difficulty = 9.2;
                    performance = 9.5;
                } else if (apparatus.equals("hoop")) {
                    difficulty = 9.45;
                    performance = 9.35;
                } else if (apparatus.equals("rope")) {
                    difficulty = 9.7;
                    performance = 9.15;
                }
                break;
        }
        System.out.printf("The team of %s get %.3f on %s.\n", country, difficulty + performance, apparatus);
        System.out.printf("%.2f%%", (20 - (difficulty + performance)) / 20 * 100);
    }
}
