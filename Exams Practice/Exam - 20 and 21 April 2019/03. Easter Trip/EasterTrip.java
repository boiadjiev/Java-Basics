package Exam20and21April2019;

import java.util.Scanner;

public class EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();
        String dates = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        int nightPrice = 0;

        switch (dates) {
            case "21-23":
                switch (destination) {
                    case "France":
                        nightPrice = 30;
                        break;
                    case "Italy":
                        nightPrice = 28;
                        break;
                    case "Germany":
                        nightPrice = 32;
                        break;
                }
                break;

            case "24-27":
                switch (destination) {
                    case "France":
                        nightPrice = 35;
                        break;
                    case "Italy":
                        nightPrice = 32;
                        break;
                    case "Germany":
                        nightPrice = 37;
                        break;
                }
                break;

            case "28-31":
                switch (destination) {
                    case "France":
                        nightPrice = 40;
                        break;
                    case "Italy":
                        nightPrice = 39;
                        break;
                    case "Germany":
                        nightPrice = 43;
                        break;
                }
                break;
        }
        System.out.printf("Easter trip to %s : %.2f leva.", destination, nights * nightPrice * 1.0);
    }
}
