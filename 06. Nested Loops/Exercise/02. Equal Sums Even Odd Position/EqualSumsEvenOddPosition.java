package NestedLoops.Exercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());

        for (int i = numOne; i <= numTwo; i++) {

            String currentNum = "" + i;
            int evenSum = 0;
            int oddSum = 0;

            for (int j = 0; j < currentNum.length(); j++) {

                int digit = Integer.parseInt("" + currentNum.charAt(j));

                if (j % 2 == 0) {
                    evenSum += digit;
                } else {
                    oddSum += digit;
                }
            }

            if (evenSum == oddSum) {
                System.out.print(i + " ");
            }
        }
    }
}
