package Exam20and21April2019;

import java.util.Scanner;

public class EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double flour1KgPrice = Double.parseDouble(scanner.nextLine());
        double flourKg = Double.parseDouble(scanner.nextLine());
        double sugarKg = Double.parseDouble(scanner.nextLine());
        int eggsBoxCount = Integer.parseInt(scanner.nextLine());
        int yeastCount = Integer.parseInt(scanner.nextLine());

        double sugar1KgPrice = flour1KgPrice * 0.75;
        double eggsBoxPrice = flour1KgPrice * 1.1;
        double yeast = sugar1KgPrice * 0.2;

        double total = sugar1KgPrice * sugarKg + eggsBoxPrice * eggsBoxCount + yeast * yeastCount + flour1KgPrice * flourKg;

        System.out.printf("%.2f", total);
    }
}
