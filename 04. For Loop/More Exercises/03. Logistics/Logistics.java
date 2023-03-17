package ForLoop.MoreExercises;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int totalWeight = 0;
        int bus = 0;
        int truck = 0;
        int train = 0;
        double price = 0;

        for (int i = 0; i < n; i++) {

            int weigh = Integer.parseInt(scanner.nextLine());
            totalWeight += weigh;

            if (weigh < 4) {
                price += weigh * 200;
                bus += weigh;

            } else if (weigh < 12) {
                price += weigh * 175;
                truck += weigh;

            } else {
                price += weigh * 120;
                train += weigh;
            }
        }
        System.out.printf("%.2f\n", price / totalWeight);
        System.out.printf("%.2f%%\n", bus * 1.0 / totalWeight * 100);
        System.out.printf("%.2f%%\n", truck * 1.0 / totalWeight * 100);
        System.out.printf("%.2f%%\n", train * 1.0 / totalWeight * 100);
    }
}
