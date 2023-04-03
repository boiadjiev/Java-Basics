package Exam6and7April2019;

import java.util.Scanner;

public class OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rent = Integer.parseInt(scanner.nextLine());
        double oscar = rent * 0.7;
        double catering = oscar * 0.85;
        double sound = catering / 2;
        double total = rent + oscar + catering + sound;
        System.out.printf("%.2f", total);
    }
}
