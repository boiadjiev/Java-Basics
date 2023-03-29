package NestedLoops.Exercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gradeCount = Integer.parseInt(scanner.nextLine());
        String presentation = scanner.nextLine();
        double gradeTotal = 0;
        int presentationCount = 0;

        while (!presentation.equals("Finish")) {

            double gradeSum = 0;
            presentationCount++;

            for (int i = 1; i <= gradeCount; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                gradeSum += grade;
            }
            System.out.printf("%s - %.2f.\n", presentation, gradeSum / gradeCount);
            gradeTotal += gradeSum / gradeCount;
            presentation = scanner.nextLine();

        }
        System.out.printf("Student's final assessment is %.2f.", gradeTotal / presentationCount);
    }
}
