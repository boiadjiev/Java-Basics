package Exam28and29March2020;

import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timePerMeter = Double.parseDouble(scanner.nextLine());

        double totalTime = distance * timePerMeter + Math.floor(distance / 50) * 30;

        if (record <= totalTime) {
            System.out.printf("No! He was %.2f seconds slower.", totalTime - record);
        } else {
            System.out.printf("Yes! The new record is %.2f seconds.", totalTime);
        }
    }
}
