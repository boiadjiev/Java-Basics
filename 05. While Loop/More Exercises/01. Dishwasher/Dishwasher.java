package WhileLoop.MoreExercises;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bottles = Integer.parseInt(scanner.nextLine());
        int detergent = bottles * 750;
        int dishes = 0;
        int pots = 0;
        int count = 0;

        while (detergent >= 0) {

            String input = scanner.nextLine();
            count++;

            if (input.equals("End")) {
                break;

            } else {
                int things = Integer.parseInt(input);

                if (count % 3 != 0) {
                    dishes += things;
                    detergent -= things * 5;
                } else {
                    pots += things;
                    detergent -= things * 15;
                }
            }
        }
        if (detergent >= 0) {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.\n", dishes, pots);
            System.out.printf("Leftover detergent %d ml.", detergent);
        } else {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(detergent));
        }
    }
}
