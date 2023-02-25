package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double volume = p1 * h + p2 * h;
        double poolPercent = volume / v * 100;
        double p1Percent = p1 * h / volume * 100;
        double p2Percent = p2 * h / volume * 100;
        if (volume <= v) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", poolPercent, p1Percent, p2Percent);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", h, volume - v);
        }
    }
}
