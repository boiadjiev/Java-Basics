package ConditionalStatements.Lab;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        if (numOne > numTwo) {
            System.out.println(numOne);
        } else {
            System.out.println(numTwo);
        }
    }
}
