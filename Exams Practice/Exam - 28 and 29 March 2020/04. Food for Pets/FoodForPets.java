package Exam28and29March2020;

import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double totalFood = Double.parseDouble(scanner.nextLine());
        int eatByDog = 0;
        int eatByCat = 0;
        int eatTotal = 0;
        double biscuits = 0;
        double biscuitsTotal = 0;

        for (int i = 1; i <= days; i++) {
            int dogFood = Integer.parseInt(scanner.nextLine());
            int catFood = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0) {
                biscuits = (dogFood + catFood) * 0.1;
                biscuitsTotal += biscuits;
            }
            eatByDog += dogFood;
            eatByCat += catFood;
            eatTotal = eatByDog + eatByCat;
        }
        System.out.printf("Total eaten biscuits: %.0fgr.\n", biscuitsTotal);
        System.out.printf("%.2f%% of the food has been eaten.\n", eatTotal * 100 / totalFood);
        System.out.printf("%.2f%% eaten from the dog.\n", eatByDog * 100.0 / eatTotal);
        System.out.printf("%.2f%% eaten from the cat.", eatByCat * 100.0 / eatTotal);
    }
}
