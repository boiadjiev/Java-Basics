package WhileLoop.Exercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int cakeSize = x * y;
        boolean noCake = false;

        while (cakeSize > 0) {

            String input = scanner.nextLine();

            if (input.equals("STOP")) {
                noCake = true;
                break;
            } else {
                cakeSize -= Integer.parseInt(input);
            }
        }
        if (noCake) {
            System.out.printf("%d pieces are left.", cakeSize);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakeSize));
        }
    }
}
