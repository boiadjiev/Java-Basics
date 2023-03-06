package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double studio = 0;
        double apartment = 0;

        switch (month) {
            case "May":
            case "October":
                studio = 50;
                apartment = 65;
                if (nights > 7 && nights <= 14) {
                    studio *= 0.95;
                } else if (nights > 14) {
                    studio *= 0.7;
                }
                break;

            case "June":
            case "September":
                studio = 75.2;
                apartment = 68.7;
                if (nights > 14) {
                    studio *= 0.8;
                }
                break;

            case "July":
            case "August":
                studio = 76;
                apartment = 77;
                break;
        }

        if (nights > 14) {
            apartment *= 0.9;
        }

        System.out.printf("Apartment: %.2f lv.\n", nights * apartment);
        System.out.printf("Studio: %.2f lv.", nights * studio);
    }
}
