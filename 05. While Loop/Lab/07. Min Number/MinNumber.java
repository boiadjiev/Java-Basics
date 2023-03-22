package WhileLoop.Lab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int min = Integer.MAX_VALUE;

        while (!"Stop".equals(input)) {

            int num = Integer.parseInt(input);

            if (num < min) {
                min = num;
            }
            input = scanner.nextLine();
        }

        System.out.println(min);
    }
}
