package Exam6and7July2019;

import java.util.Scanner;

public class Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());

        int area = x * y * 4;
        area -= area * p / 100;

        String input = scanner.nextLine();

        while (!input.equals("Tired!")) {

            area -= Integer.parseInt(input);

            if (area <= 0) {
                break;
            }

            input = scanner.nextLine();
        }

        if (area > 0) {
            System.out.printf("%d quadratic m left.", area);
        } else if (area == 0) {
            System.out.println("All walls are painted! Great job, Pesho!");
        } else {
            System.out.printf("All walls are painted and you have %d l paint left!", Math.abs(area));
        }
    }
}
