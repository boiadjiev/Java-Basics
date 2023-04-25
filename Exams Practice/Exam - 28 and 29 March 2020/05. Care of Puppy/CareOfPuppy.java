package Exam28and29March2020;

import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int foodKg = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int food = foodKg * 1000;
        int totalFoodEaten = 0;

        while (!input.equals("Adopted")) {
            int footEaten = Integer.parseInt(input);
            totalFoodEaten += footEaten;
            input = scanner.nextLine();
        }
        if (food >= totalFoodEaten) {
            System.out.printf("Food is enough! Leftovers: %d grams.", food - totalFoodEaten);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", totalFoodEaten - food);
        }
    }
}
