package Exam6and7April2019;

import java.util.Scanner;

public class OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        String room = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());
        double ticketPrice = 0;

        switch (movie) {
            case "A Star Is Born":
                if (room.equals("normal")) {
                    ticketPrice = 7.5;
                } else if (room.equals("luxury")) {
                    ticketPrice = 10.5;
                } else if (room.equals("ultra luxury")) {
                    ticketPrice = 13.5;
                }
                break;

            case "Bohemian Rhapsody":
                if (room.equals("normal")) {
                    ticketPrice = 7.35;
                } else if (room.equals("luxury")) {
                    ticketPrice = 9.45;
                } else if (room.equals("ultra luxury")) {
                    ticketPrice = 12.75;
                }
                break;

            case "Green Book":
                if (room.equals("normal")) {
                    ticketPrice = 8.15;
                } else if (room.equals("luxury")) {
                    ticketPrice = 10.25;
                } else if (room.equals("ultra luxury")) {
                    ticketPrice = 13.25;
                }
                break;

            case "The Favourite":
                if (room.equals("normal")) {
                    ticketPrice = 8.75;
                } else if (room.equals("luxury")) {
                    ticketPrice = 11.55;
                } else if (room.equals("ultra luxury")) {
                    ticketPrice = 13.95;
                }
                break;
        }
        System.out.printf("%s -> %.2f lv.", movie, tickets * ticketPrice);
    }
}
