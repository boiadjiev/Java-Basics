package ForLoop.Exercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double wmPrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        double money = 0;
        int toys = 0;

        for (int i = 1; i <= n; i++) {

            if (i % 2 != 0) {
                toys ++;
            } else {
                money += (10.0 * i / 2) - 1;
            }
        }

        money += toys * toyPrice;

        if (money >= wmPrice) {
            System.out.printf("Yes! %.2f", money - wmPrice);
        } else {
            System.out.printf("No! %.2f", wmPrice - money);
        }
    }
}
