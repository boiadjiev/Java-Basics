package Exam28and29March2020;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupCount = Integer.parseInt(scanner.nextLine());
        int totalPeople = 0;
        int m1 = 0, m2 = 0, m3 = 0, m4 = 0, m5 = 0;

        for (int i = 0; i < groupCount; i++) {
            int peopleCount = Integer.parseInt(scanner.nextLine());

            totalPeople += peopleCount;

            if (peopleCount <= 5) {
                m1 += peopleCount;
            } else if (peopleCount < 13) {
                m2 += peopleCount;
            } else if (peopleCount < 26) {
                m3 += peopleCount;
            } else if (peopleCount < 41) {
                m4 += peopleCount;
            } else {
                m5 += peopleCount;
            }
        }
        System.out.printf("%.2f%%\n", m1 * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%\n", m2 * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%\n", m3 * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%\n", m4 * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%\n", m5 * 1.0 / totalPeople * 100);
    }
}
