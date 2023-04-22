package Exam28and29March2020;

import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int btc = Integer.parseInt(scanner.nextLine());
        double cny = Double.parseDouble(scanner.nextLine());
        double commPercent = Double.parseDouble(scanner.nextLine());

        double total = (btc * 1168 + cny * 0.15 * 1.76) / 1.95;
        double commission = commPercent * total / 100;

        System.out.printf("%.2f", total - commission);
    }
}
