package ForLoop.MoreExercises;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double points = 0;
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        int p6 = 0;

        for (int i = 0; i < n; i++) {

            int num = Integer.parseInt(scanner.nextLine());

            if (num >= 0 && num <= 9) {
                points += num * 0.2;
                p1++;
            } else if (num >= 10 && num <= 19) {
                points += num * 0.3;
                p2++;
            } else if (num >= 20 && num <= 29) {
                points += num * 0.4;
                p3++;
            } else if (num >= 30 && num <= 39) {
                points += 50;
                p4++;
            } else if (num >= 40 && num <= 50) {
                points += 100;
                p5++;
            } else {
                points /= 2;
                p6++;
            }
        }
        System.out.printf("%.2f\n", points);
        System.out.printf("From 0 to 9: %.2f%%\n", p1 * 1.0 / n * 100);
        System.out.printf("From 10 to 19: %.2f%%\n", p2 * 1.0 / n * 100);
        System.out.printf("From 20 to 29: %.2f%%\n", p3 * 1.0 / n * 100);
        System.out.printf("From 30 to 39: %.2f%%\n", p4 * 1.0 / n * 100);
        System.out.printf("From 40 to 50: %.2f%%\n", p5 * 1.0 / n * 100);
        System.out.printf("Invalid numbers: %.2f%%\n", p6 * 1.0 / n * 100);
    }
}
