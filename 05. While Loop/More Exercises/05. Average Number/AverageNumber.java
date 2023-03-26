package WhileLoop.MoreExercises;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int i = 1;
        int num = 0;
        int total = 0;

        while (n >= i) {
            num = Integer.parseInt(scanner.nextLine());
            total += num;
            i++;
        }
        System.out.printf("%.2f", total * 1.0 / n);
    }
}
