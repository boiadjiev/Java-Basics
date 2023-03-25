package WhileLoop.MoreExercises;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int neededSum = Integer.parseInt(scanner.nextLine());
        int totalSum = 0;
        int counter = 0;
        int cashSum = 0;
        int creditCardSum = 0;
        int cashCount = 0;
        int creditCardCount = 0;
        boolean isEnd = false;

        while (totalSum < neededSum) {

            String input = scanner.nextLine();
            counter++;
            if (input.equals("End")) {
                isEnd = true;
                break;

            } else {
                int itemPrice = Integer.parseInt(input);
                if (counter % 2 != 0) {

                   if (itemPrice > 100) {
                       System.out.println("Error in transaction!");
                   } else {
                       System.out.println("Product sold!");
                       totalSum += itemPrice;
                       cashCount++;
                       cashSum += itemPrice;
                   }

                } else {
                    if (itemPrice < 10) {
                        System.out.println("Error in transaction!");
                    } else {
                        System.out.println("Product sold!");
                        totalSum += itemPrice;
                        creditCardCount++;
                        creditCardSum += itemPrice;
                    }
                }
            }
        }
        if (isEnd) {
            System.out.println("Failed to collect required money for charity.");
        } else {
            System.out.printf("Average CS: %.2f\n", cashSum * 1.0 / cashCount);
            System.out.printf("Average CC: %.2f\n", creditCardSum * 1.0 / creditCardCount);
        }
    }
}
