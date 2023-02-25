package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int holidaysPerYear = Integer.parseInt(scanner.nextLine());
        int workingDays = (365 - holidaysPerYear) * 63;
        int holidays = holidaysPerYear * 127;
        int playDays = workingDays + holidays;
        int remainingMinutes = Math.abs(playDays - 30000);
        int hours = remainingMinutes / 60;
        int minutes = remainingMinutes % 60;
        if (playDays >= 30000) {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hours, minutes);
        }
            else {
                System.out.println("Tom sleeps well");
                System.out.printf("%d hours and %d minutes less for play", hours, minutes);
            }
    }
}
