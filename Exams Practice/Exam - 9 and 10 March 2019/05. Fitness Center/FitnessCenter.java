package Exam9and10March2019;

import java.util.Scanner;

public class FitnessCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int back = 0;
        int chest = 0;
        int legs = 0;
        int abs = 0;
        int proteinShake = 0;
        int proteinBar = 0;
        int workout = 0;
        int product = 0;

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();

            switch (input) {
                case "Back":
                    back++;
                    workout++;
                    break;
                case "Chest":
                    chest++;
                    workout++;
                    break;
                case "Legs":
                    legs++;
                    workout++;
                    break;
                case "Abs":
                    abs++;
                    workout++;
                    break;
                case "Protein shake":
                    proteinShake++;
                    product++;
                    break;
                case "Protein bar":
                    proteinBar++;
                    product++;
                    break;
            }
        }
        System.out.printf("%d - back\n%d - chest\n%d - legs\n%d - abs\n%d - protein shake\n%d - protein bar\n", back, chest, legs, abs, proteinShake, proteinBar);
        System.out.printf("%.2f%% - work out\n%.2f%% - protein", workout * 1.0 / n * 100, product * 1.0 / n * 100);
    }
}
