package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double wLength = Double.parseDouble(scanner.nextLine());
        double hWidth = Double.parseDouble(scanner.nextLine());
        double desksPerRow = Math.floor((hWidth - 1) / 0.7);
        double rows = Math.floor(wLength / 1.2);
        double totalSeats = rows * desksPerRow - 3;
        System.out.printf("%.0f", totalSeats);
    }
}
