package ForLoop.Lab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumOne = 0;
        int sumTwo = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sumOne += num;
        }

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sumTwo += num;
        }

        if (sumOne == sumTwo) {
            System.out.printf("Yes, sum = %d", sumOne);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sumOne - sumTwo));
        }
    }
}
