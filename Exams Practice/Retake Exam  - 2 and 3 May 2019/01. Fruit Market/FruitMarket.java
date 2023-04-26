package RetakeExam2and3May2019;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double bananasKg = Double.parseDouble(scanner.nextLine());
        double orangesKg = Double.parseDouble(scanner.nextLine());
        double raspberryKg = Double.parseDouble(scanner.nextLine());
        double strawberryKg = Double.parseDouble(scanner.nextLine());

        double raspberryPrice = strawberryPrice / 2;
        double orangesPrice = raspberryPrice * 0.6;
        double bananasPrice = raspberryPrice * 0.2;

        double total = strawberryPrice * strawberryKg + raspberryPrice * raspberryKg + orangesPrice * orangesKg + bananasPrice * bananasKg;
        System.out.printf("%.2f", total);
     }
}
