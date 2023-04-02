package NestedLoops.MoreExercises;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int begin = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int i1 = 0;
        int i2 = 0;
        int combinationCount = 0;
        boolean isFound = false;

        for (i1 = begin; i1 <= end; i1++) {

            for (i2 = begin; i2 <= end; i2++) {

                combinationCount++;

                if (i1 + i2 == magicNumber) {
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }

        if (isFound) {
            System.out.printf("Combination N:%d (%d + %d = %d)", combinationCount, i1, i2, magicNumber);
        } else {
            System.out.printf("%d combinations - neither equals %d", combinationCount, magicNumber);
        }
    }
}
