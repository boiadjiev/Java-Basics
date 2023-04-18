package Exam20and21April2019;

import java.util.Scanner;

public class EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int easterBreads = Integer.parseInt(scanner.nextLine());
        int eggsBox = Integer.parseInt(scanner.nextLine());
        int cookies = Integer.parseInt(scanner.nextLine());

        double total = easterBreads * 3.2 + eggsBox * 4.35 + cookies * 5.4 + eggsBox * 12 * 0.15;
        System.out.printf("%.2f", total);
    }
}
