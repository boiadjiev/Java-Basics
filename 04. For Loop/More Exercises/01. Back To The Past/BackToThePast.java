package ForLoop.MoreExercises;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inheritanceMoney = Double.parseDouble(scanner.nextLine());
        int yearToLive = Integer.parseInt(scanner.nextLine());
        double moneyLeft = inheritanceMoney;
        int years = 17;

        for (int i = 1800; i <= yearToLive; i++) {

            years++;

            if (i % 2 == 0) {
                moneyLeft -= 12000;
            } else {
                moneyLeft -= 12000 + years * 50;
            }
        }

        if (moneyLeft >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", moneyLeft);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(moneyLeft));
        }
    }
}
