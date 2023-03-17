package ForLoop.MoreExercises;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double gradeSum = 0;
        int s1 = 0;
        int s2 = 0;
        int s3 = 0;
        int s4 = 0;

        for (int i = 0; i < n; i++) {

            double grade = Double.parseDouble(scanner.nextLine());
            gradeSum += grade;

            if (grade > 4.99) {
                s1++;
            } else if (grade > 3.99) {
                s2++;
            } else if (grade > 2.99) {
                s3++;
            } else {
                s4++;
            }
        }
        System.out.printf("Top students: %.2f%%\n", s1 * 1.0 / n * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", s2 * 1.0 / n * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", s3 * 1.0 / n * 100);
        System.out.printf("Fail: %.2f%%\n", s4 * 1.0 / n * 100);
        System.out.printf("Average: %.2f", gradeSum / n);
    }
}
