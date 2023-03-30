package NestedLoops.Exercise;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        int totalTickets = 0;
        int student = 0;
        int standard = 0;
        int kid = 0;

        while (!movieName.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            String ticketType = scanner.nextLine();
            int takenSeats = 0;

            while (!ticketType.equals("End")) {
                takenSeats++;
                totalTickets++;

                switch (ticketType) {
                    case "student":
                        student++;
                        break;
                    case "standard":
                        standard++;
                        break;
                    case "kid":
                        kid++;
                        break;
                }
                if (freeSeats - takenSeats <= 0) {
                    break;
                }
                ticketType = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.\n", movieName, takenSeats * 1.0 / freeSeats * 100);
            movieName = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d\n", totalTickets);
        System.out.printf("%.2f%% student tickets.\n", student * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.\n", standard * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", kid * 1.0 / totalTickets * 100);
    }
}
