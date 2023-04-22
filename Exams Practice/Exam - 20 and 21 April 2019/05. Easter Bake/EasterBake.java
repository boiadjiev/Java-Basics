package Exam20and21April2019;

import java.util.Scanner;

public class EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int easterBreads = Integer.parseInt(scanner.nextLine());
        int maxSugar = Integer.MIN_VALUE;
        int maxFlour = Integer.MIN_VALUE;
        int sugarTotal = 0;
        int flourTotal = 0;

        for (int i = 0; i < easterBreads; i++) {
            int sugar = Integer.parseInt(scanner.nextLine());
            int flour = Integer.parseInt(scanner.nextLine());

            if (sugar > maxSugar) {
                maxSugar = sugar;
            }
            if (flour > maxFlour) {
                maxFlour = flour;
            }
            sugarTotal += sugar;
            flourTotal += flour;
        }
        System.out.printf("Sugar: %.0f\n", Math.ceil(sugarTotal / 950.0));
        System.out.printf("Flour: %.0f\n", Math.ceil(flourTotal / 750.0));
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxFlour, maxSugar);
    }
}
