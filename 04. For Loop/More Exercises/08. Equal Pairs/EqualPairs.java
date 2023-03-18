package ForLoop.MoreExercises;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        int diff;

        for (int i = 1; i <= n; i++) {

            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());

            if (i % 2 != 0) {
                sum1 = num1 + num2;
            } else {
                sum2 = num1 + num2;
            }
        }

        diff = Math.abs(sum1 - sum2);

        if (sum1 == sum2 || n < 2) {
            System.out.printf("Yes, value=%d", sum1);
        } else {
            System.out.printf("No, maxdiff=%d", diff);
        }
    }
}
