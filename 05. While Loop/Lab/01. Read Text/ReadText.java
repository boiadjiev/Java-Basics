package WhileLoop.Lab;

import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        while (!"Stop".equals(text)) {

            System.out.println(text);
            text = scanner.nextLine();
        }
    }
}
