package ConditionalStatements.Exercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double excursion = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());
        double sum = puzzles * 2.6 + dolls * 3 + bears * 4.1 + minions * 8.2 + trucks * 2;
        int pieces = puzzles + dolls + bears + minions + trucks;
        if (pieces >= 50) {
            sum = sum - sum * 0.25;
        }
        sum = sum - sum * 0.1;
        double money = Math.abs(sum - excursion);
        if (sum >= excursion) {
            System.out.printf("Yes! %.2f lv left.", money);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", money);
        }
    }
}
