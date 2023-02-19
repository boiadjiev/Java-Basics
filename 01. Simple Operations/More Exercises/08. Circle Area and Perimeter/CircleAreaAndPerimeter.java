package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());
        double s = Math.PI * r * r;
        double p = 2 * Math.PI * r;
        System.out.printf("%.2f\n", s);
        System.out.printf("%.2f", p);
    }
}
