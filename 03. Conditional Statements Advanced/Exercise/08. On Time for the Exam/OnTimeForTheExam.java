package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());

        int examTotalMinutes = examHour * 60 + examMinute;
        int arrivalTotalMinutes = arrivalHour * 60 + arrivalMinute;
        int diff = arrivalTotalMinutes - examTotalMinutes;

        if (diff > 0) {
            System.out.println("Late");
        } else if (diff < 0 && diff >= -30 || diff == 0) {
            System.out.println("On time");
        } else {
            System.out.println("Early");
        }

        if (diff < 0 && diff > -60) {
            System.out.printf("%d minutes before the start", Math.abs(diff));
        } else if (diff <= -60) {
            int hours = Math.abs(diff) / 60;
            int minutes = Math.abs(diff) % 60;
            System.out.printf("%d:%02d hours before the start", hours, minutes);
        } else if (diff > 0 && diff < 60) {
            System.out.printf("%d minutes after the start", diff);
        } else if (diff >= 60) {
            int hours = diff / 60;
            int minutes = diff % 60;
            System.out.printf("%d:%02d hours after the start", hours, minutes);
        }
    }
}
