package Exam6and7July2019;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        double fee = Double.parseDouble(scanner.nextLine());
        double loungePrice = Double.parseDouble(scanner.nextLine());
        double umbrellaPrice = Double.parseDouble(scanner.nextLine());

        double umbrellaCount = Math.ceil(people / 2.0);
        double loungeCount = Math.ceil(people * 0.75);
        double sum = people * fee + loungePrice * loungeCount + umbrellaPrice * umbrellaCount;

        System.out.printf("%.2f lv.", sum);
    }
}
