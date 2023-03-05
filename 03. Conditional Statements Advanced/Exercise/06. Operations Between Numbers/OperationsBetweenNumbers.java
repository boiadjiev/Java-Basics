package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        String operator = scanner.nextLine();
        String evenOrOdd;
        double result = 0;
        boolean isZero = false;

        switch (operator) {
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "*":
                result = x * y;
                break;
            case "/":
                if (y == 0) {
                    isZero = true;
                } else {
                    result = x * 1.0 / y;
                }
                break;
            case "%":
                if (y == 0) {
                    isZero = true;
                } else {
                    result = x % y;
                }
                break;
        }

        if (result % 2 == 0) {
            evenOrOdd = "even";
        } else {
            evenOrOdd = "odd";
        }

        if ("+".equals(operator) || "-".equals(operator) || "*".equals(operator)) {
            System.out.printf("%d %s %d = %.0f - %s", x, operator, y, result, evenOrOdd);
        } else if ("/".equals(operator) && !isZero) {
            System.out.printf("%d / %d = %.2f", x, y, result);
        } else if ("%".equals(operator) && !isZero) {
            System.out.printf("%d %% %d = %.0f", x, y, result);
        } else {
            System.out.printf("Cannot divide %d by zero", x);
        }
    }
}
