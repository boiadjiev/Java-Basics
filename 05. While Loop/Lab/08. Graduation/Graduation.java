package WhileLoop.Lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int gradeCount = 0;
        int excluded = 2;
        double gradeTotal = 0;
        boolean isExcluded = false;

        while (gradeCount < 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            gradeCount++;
            gradeTotal += grade;

            if (grade < 4) {
                excluded--;
            }
            if (excluded == 0) {
                isExcluded = true;
                break;
            }
        }
        if (isExcluded) {
            System.out.printf("%s has been excluded at %d grade", name, gradeCount - 1);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", name, gradeTotal / gradeCount);
        }
    }
}
