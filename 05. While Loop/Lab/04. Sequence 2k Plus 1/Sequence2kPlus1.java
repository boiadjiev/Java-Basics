package WhileLoop.Lab;

import java.util.Scanner;
public class Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int row = 1;

        while (n >= row) {

            System.out.println(row);
            row = row * 2 + 1;
        }
    }
}
