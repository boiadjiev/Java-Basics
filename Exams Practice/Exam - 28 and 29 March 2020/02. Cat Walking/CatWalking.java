package Exam28and29March2020;

import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int walkMin = Integer.parseInt(scanner.nextLine());
        int walkCount = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());

        int burnedCalories = walkMin * walkCount * 5;
        int halfCalories = 50 * calories / 100;

        if (burnedCalories >= halfCalories) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", burnedCalories);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", burnedCalories);
        }
    }
}
