package NestedLoops.MoreExercises;

import java.util.Scanner;

public class PrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initValueOne = Integer.parseInt(scanner.nextLine());
        int initValueTwo = Integer.parseInt(scanner.nextLine());
        int diffOne = Integer.parseInt(scanner.nextLine());
        int diffTwo = Integer.parseInt(scanner.nextLine());

        for (int i1 = initValueOne; i1 <= initValueOne + diffOne; i1++) {

            for (int i2 = initValueTwo; i2 <= initValueTwo + diffTwo; i2++) {

                if (isPrime(i1) && isPrime(i2)) {
                    System.out.printf("%d%d\n", i1, i2);
                }
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
