package RetakeExam2and3May2019;

import java.util.Scanner;

public class DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        for (int i = 1; i <= n; i++) {

            int number = Integer.parseInt(scanner.nextLine());

            if (number % 2 == 0) {
                p1++;
            }
            if (number % 3 == 0) {
                p2++;
            }
            if (number % 4 == 0) {
                p3++;
            }
        }
        System.out.printf("%.2f%%\n", p1 * 1.0 / n * 100);
        System.out.printf("%.2f%%\n", p2 * 1.0 / n * 100);
        System.out.printf("%.2f%%\n", p3 * 1.0 / n * 100);
    }
}
