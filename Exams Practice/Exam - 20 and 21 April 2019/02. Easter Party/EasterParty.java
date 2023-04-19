package Exam20and21April2019;

import java.util.Scanner;

public class EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guests = Integer.parseInt(scanner.nextLine());
        double cover = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        double cake = budget * 0.1;

        if (guests > 20) {
            cover *= 0.75;
        } else if (guests > 15) {
            cover *= 0.8;
        } else if (guests > 9) {
            cover *= 0.85;
        }

        double total = guests * cover + cake;

        if (budget >= total) {
            System.out.printf("It is party time! %.2f leva left.", budget - total);
        } else {
            System.out.printf("No party! %.2f leva needed.", total - budget);
        }
    }
}
