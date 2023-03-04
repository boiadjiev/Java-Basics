package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class Cinema {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projection = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double income = 0.0;

        switch (projection) {
            case "Premiere":
                income = r * c * 12;
                break;
            case "Normal":
                income = r * c * 7.5;
                break;
            case "Discount":
                income = r * c * 5;
                break;
        }

        System.out.printf("%.2f leva", income);
    }
}
