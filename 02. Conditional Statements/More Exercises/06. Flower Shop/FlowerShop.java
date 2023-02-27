package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnolia = Integer.parseInt(scanner.nextLine());
        int hyacinth = Integer.parseInt(scanner.nextLine());
        int rose = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double order = magnolia * 3.25 + hyacinth * 4 + rose * 3.5 + cactus * 8;
        double orderTotal = order - order * 0.05;
        double diff = Math.abs(orderTotal - giftPrice);

        if (giftPrice <= orderTotal) {
            System.out.printf("She is left with %.0f leva.", Math.floor(diff));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(diff));
        }
    }
}
