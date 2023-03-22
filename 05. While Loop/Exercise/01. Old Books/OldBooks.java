package WhileLoop.Exercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String book = scanner.nextLine();
        String input = scanner.nextLine();
        boolean isHere = false;
        int count = 0;

        while (!"No More Books".equals(input)) {

            if (input.equals(book)) {
                isHere = true;
                break;
            }
            count++;
            input = scanner.nextLine();
        }
        if (isHere) {
            System.out.printf("You checked %d books and found it.", count);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", count);
        }
    }
}
