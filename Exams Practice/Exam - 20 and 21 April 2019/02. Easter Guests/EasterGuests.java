package Exam20and21April2019;

import java.util.Scanner;

public class EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guests = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double easterBredCount = Math.ceil(guests / 3.0);
        int eggsCount = guests * 2;
        double total = easterBredCount * 4 + eggsCount * 0.45;

        if (budget >= total) {
            System.out.printf("Lyubo bought %.0f Easter bread and %d eggs.\nHe has %.2f lv. left.", easterBredCount, eggsCount, budget - total);
        } else {
            System.out.printf("Lyubo doesn't have enough money.\nHe needs %.2f lv. more.", total - budget);
        }
    }
}
