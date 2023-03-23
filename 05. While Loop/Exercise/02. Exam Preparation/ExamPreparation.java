package WhileLoop.Exercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int poorGradeCount = Integer.parseInt(scanner.nextLine());
        String inputName = scanner.nextLine();
        String taskName = "";
        int poorGrades = 0;
        int gradeSum = 0;
        int gradeCount = 0;
        boolean needBreak = false;

        while (!inputName.equals("Enough")) {

            int grade = Integer.parseInt(scanner.nextLine());

            taskName = inputName;
            gradeSum += grade;
            gradeCount++;

            if (grade <= 4) {
                poorGrades++;
            }
            if (poorGradeCount == poorGrades) {
                needBreak = true;
                break;
            }
            inputName = scanner.nextLine();
        }

        if (needBreak) {
            System.out.printf("You need a break, %d poor grades.", poorGrades);
        } else {
            System.out.printf("Average score: %.2f\n", gradeSum * 1.0 / gradeCount);
            System.out.printf("Number of problems: %d\n", gradeCount);
            System.out.printf("Last problem: %s", taskName);
        }
    }
}
