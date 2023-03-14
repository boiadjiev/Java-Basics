package ForLoop.Exercise;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;
            if (num > max) {
                max = num;
            }
        }

        int sumWithoutMax = sum - max;

        if (sumWithoutMax == max) {
            System.out.printf("Yes\nSum = %d", sumWithoutMax);
        } else {
            System.out.printf("No\nDiff = %d", Math.abs(max-sumWithoutMax));
        }
    }
}
