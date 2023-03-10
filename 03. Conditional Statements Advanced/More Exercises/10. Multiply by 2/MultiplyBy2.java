package ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());

        while (num >= 0) {
            System.out.println();
            System.out.printf("Result: %.2f", num * 2);
            num = Double.parseDouble(scanner.nextLine());
        }
        if (num < 0) {
            System.out.printf("\nNegative number!");
        }
    }
}
