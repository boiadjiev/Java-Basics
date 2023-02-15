package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon  = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double materialsCosts = ((nylon + 2) * 1.50) + (paint * 1.1 * 14.50) + (thinner * 5.00) + 0.40;
        double workersFeePerHour = materialsCosts * 0.3;
        double total = materialsCosts + hours * workersFeePerHour;
        System.out.println(total);
    }
}
