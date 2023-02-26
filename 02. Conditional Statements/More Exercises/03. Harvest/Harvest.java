package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        int w = Integer.parseInt(scanner.nextLine());
        double grapes = x * y;
        double vine = grapes * 0.4 / 2.5;
        double diff = Math.abs(z - vine);
        if (vine < z) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(diff));
        } else {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n", Math.floor(vine));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(diff), Math.ceil(diff/w));
        }
    }
}
