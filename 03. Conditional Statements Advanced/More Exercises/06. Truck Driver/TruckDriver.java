package ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;
public class TruckDriver {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double km = Double.parseDouble(scanner.nextLine());
        double sum = 0;

        switch (season) {
            case "Spring":
            case "Autumn":
                if (km <= 5000) {
                    sum = km * 0.75;
                } else if (km > 5000 && km <= 10000) {
                    sum = km * 0.95;
                } else if (km > 10000 && km <= 20000) {
                    sum = km * 1.45;
                }
                break;

            case "Summer":
                if (km <= 5000) {
                    sum = km * 0.9;
                } else if (km > 5000 && km <= 10000) {
                    sum = km * 1.1;
                } else if (km > 10000 && km <= 20000) {
                    sum = km * 1.45;
                }
                break;

            case "Winter":
                if (km <= 5000) {
                    sum = km * 1.05;
                } else if (km > 5000 && km <= 10000) {
                    sum = km * 1.25;
                } else if (km > 10000 && km <= 20000) {
                    sum = km * 1.45;
                }
                break;
        }

        sum *= 4;
        sum *= 0.9;
        System.out.printf("%.2f", sum);
    }
}
