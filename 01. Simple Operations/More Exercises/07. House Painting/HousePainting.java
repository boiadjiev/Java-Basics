package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double greenArea = (x * x * 2) + (x * y * 2) - 6.9;
        double redArea = (x * y * 2) + (x * h / 2 * 2);
        double greenPaint = greenArea / 3.4;
        double redPaint = redArea / 4.3;

        System.out.printf("%.2f\n", greenPaint);
        System.out.printf("%.2f", redPaint);
    }
}
