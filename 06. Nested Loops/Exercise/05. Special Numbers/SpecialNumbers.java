package NestedLoops.Exercise;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());

        for (int i = 1111; i <= 9999; i++) {

            int magicCount = 0;

            for (int j = 0; j < 4; j++) {

                String currentNum = "" + i;
                int digit = Integer.parseInt("" + currentNum.charAt(j));

                if (n % digit == 0) {
                    magicCount++;
                }

                if (magicCount == 4) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
