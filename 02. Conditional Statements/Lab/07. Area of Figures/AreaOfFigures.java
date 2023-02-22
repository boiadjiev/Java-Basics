package ConditionalStatements.Lab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        double area = 0;
        if ("square".equals(figure)) {
            double a = Double.parseDouble(scanner.nextLine());
            area = a * a;
        } else if ("rectangle".equals(figure)) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            area = a * b;
        } else if ("circle".equals(figure)) {
            double r = Double.parseDouble(scanner.nextLine());
            area = Math.PI * r * r;
        } else if ("triangle".equals(figure)) {
            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            area = a * h / 2;
        }
        System.out.printf("%.3f", area);
    }
}
