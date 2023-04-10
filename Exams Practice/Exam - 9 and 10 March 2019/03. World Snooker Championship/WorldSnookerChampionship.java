package Exam9and10March2019;

import java.util.Scanner;

public class WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stage = scanner.nextLine();
        String ticketType = scanner.nextLine();
        int ticketsCount = Integer.parseInt(scanner.nextLine());
        String photo = scanner.nextLine();
        double ticketPrice = 0;
        double photoPrice = 0;
        double total;

        switch (stage) {
            case "Quarter final":
                if (ticketType.equals("Standard")) {
                    ticketPrice = 55.5;
                } else if (ticketType.equals("Premium")) {
                    ticketPrice = 105.2;
                } else if (ticketType.equals("VIP")) {
                    ticketPrice = 118.9;
                }
                break;

            case "Semi final":
                if (ticketType.equals("Standard")) {
                    ticketPrice = 75.88;
                } else if (ticketType.equals("Premium")) {
                    ticketPrice = 125.22;
                } else if (ticketType.equals("VIP")) {
                    ticketPrice = 300.4;
                }
                break;

            case "Final":
                if (ticketType.equals("Standard")) {
                    ticketPrice = 110.1;
                } else if (ticketType.equals("Premium")) {
                    ticketPrice = 160.66;
                } else if (ticketType.equals("VIP")) {
                    ticketPrice = 400;
                }
                break;
        }
        total = ticketsCount * ticketPrice;

        if (total <= 4000 && photo.equals("Y")) {
            photoPrice = 40;
        }

        if (total > 4000) {
            total *= 0.75;
        } else if (total > 2500) {
            total *= 0.9;
        }

        photoPrice *= ticketsCount;
        total += photoPrice;

        System.out.printf("%.2f", total);
    }
}
