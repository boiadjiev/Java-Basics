package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        int ticketPrice = 0;

        if ("Monday".equals(day) || "Tuesday".equals(day) || "Friday".equals(day)) {
            ticketPrice = 12;
        } else if ("Wednesday".equals(day) || "Thursday".equals(day)) {
            ticketPrice = 14;
        } else if ("Saturday".equals(day) || "Sunday".equals(day)) {
            ticketPrice = 16;
        }

        System.out.println(ticketPrice);
    }
}
