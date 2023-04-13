package Exam15and16June2019;

import java.util.Scanner;

public class FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        String packet = scanner.nextLine();
        int ticketCount = Integer.parseInt(scanner.nextLine());
        double ticketPrice = 0;
        double total;

        switch (movie) {
            case "John Wick":
                if (packet.equals("Drink")) {
                    ticketPrice = 12;
                } else if (packet.equals("Popcorn")) {
                    ticketPrice = 15;
                } else if (packet.equals("Menu")) {
                    ticketPrice = 19;
                }
                break;

            case "Star Wars":
                if (packet.equals("Drink")) {
                    ticketPrice = 18;
                } else if (packet.equals("Popcorn")) {
                    ticketPrice = 25;
                } else if (packet.equals("Menu")) {
                    ticketPrice = 30;
                }
                break;

            case "Jumanji":
                if (packet.equals("Drink")) {
                    ticketPrice = 9;
                } else if (packet.equals("Popcorn")) {
                    ticketPrice = 11;
                } else if (packet.equals("Menu")) {
                    ticketPrice = 14;
                }
                break;
        }
        total = ticketCount * ticketPrice;

        if (movie.equals("Star Wars") && ticketCount >= 4) {
            total *= 0.7;
        }else if (movie.equals("Jumanji") && ticketCount == 2) {
            total *= 0.85;
        }
        System.out.printf("Your bill is %.2f leva.", total);
    }
}
