package ForLoop.Lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int total = 0;

        for (int i = 0; i < count; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            total += number;
        }

        System.out.println(total);
    }
}
