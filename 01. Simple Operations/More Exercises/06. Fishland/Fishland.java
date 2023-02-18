package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double scumriaPrice = Double.parseDouble(scanner.nextLine());
        double cacaPrice  = Double.parseDouble(scanner.nextLine());
        double palamudKg = Double.parseDouble(scanner.nextLine());
        double safridKg = Double.parseDouble(scanner.nextLine());
        int midiKg = Integer.parseInt(scanner.nextLine());
        double palamuPrice = scumriaPrice * 1.6;
        double safridPrice = cacaPrice * 1.8;
        double total = palamuPrice * palamudKg + safridPrice * safridKg + 7.50 * midiKg;
        System.out.printf("%.2f", total);
    }
}
