package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int detergent = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());
        double pensValue = 5.80;
        double markersValue = 7.20;
        double detergentValue = 1.20;
        double sum = pens * pensValue + markers * markersValue + detergent * detergentValue;
        double discount = sum * percent / 100;
        double total = sum - discount;
        System.out.println(total);
    }
}
