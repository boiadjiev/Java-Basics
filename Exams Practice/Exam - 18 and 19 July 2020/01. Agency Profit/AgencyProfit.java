package Exam18and19July2020;

import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String airline = scanner.nextLine();
        int ticketsAdults = Integer.parseInt(scanner.nextLine());
        int ticketsKids = Integer.parseInt(scanner.nextLine());
        double ticketAdultPrice = Double.parseDouble(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());
        double ticketKidPrice = ticketAdultPrice * 0.3;
        double total;
        double profit;

        ticketAdultPrice += tax;
        ticketKidPrice += tax;
        total = ticketsAdults * ticketAdultPrice + ticketsKids * ticketKidPrice;
        profit = total * 20 / 100;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", airline, profit);
    }
}
