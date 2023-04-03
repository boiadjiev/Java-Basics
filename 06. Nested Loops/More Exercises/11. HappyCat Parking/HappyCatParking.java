package NestedLoops.MoreExercises;

import java.util.Scanner;

public class HappyCatParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double totalSum = 0;

        for (int d = 1; d <= days; d++) {

            double sum = 0;

            for (int h = 1; h <= hours; h++) {

                if (d % 2 == 0 && h % 2 != 0) {
                    sum += 2.5;
                } else if (d % 2 != 0 && h % 2 == 0) {
                    sum += 1.25;
                } else {
                    sum += 1;
                }
            }

            System.out.printf("Day: %d - %.2f leva\n", d, sum);
            totalSum += sum;
        }

        System.out.printf("Total: %.2f leva", totalSum);
    }
}
