package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();
        double price = 0;

        if (km < 20) {
            if ("day".equals(dayOrNight)) {
                price = 0.7 + 0.79 * km;
            } else  {
                price = 0.7 + 0.9 * km;
            }
        }

        if (km >= 20 && km < 100) {
            price = 0.09 * km;
        } else if (km >= 100) {
            price = 0.06 * km;
        }

        System.out.printf("%.2f", price);
    }
}
