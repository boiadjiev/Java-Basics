package ConditionalStatements.Exercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());
        double secondsNeeded = distance * time;
        double secondsAdded = Math.floor(distance / 15) * 12.5;
        double totalTime = secondsNeeded + secondsAdded;
        if (totalTime < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else if (totalTime >= record) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime - record);
        }
    }
}
