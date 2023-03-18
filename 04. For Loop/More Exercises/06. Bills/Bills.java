package ForLoop.MoreExercises;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double electricity = 0;
        double other = 0;

        for (int i = 0; i < n; i++) {

            double bill = Double.parseDouble(scanner.nextLine());
            electricity += bill;
            other += (bill + 35) * 1.2;
        }

        System.out.printf("Electricity: %.2f lv\n", electricity);
        System.out.printf("Water: %.2f lv\n", n * 20.0);
        System.out.printf("Internet: %.2f lv\n", n * 15.0);
        System.out.printf("Other: %.2f lv\n", other);
        System.out.printf("Average: %.2f lv\n", (electricity + n * 20.0 + n * 15.0 + other) / n);
    }
}
