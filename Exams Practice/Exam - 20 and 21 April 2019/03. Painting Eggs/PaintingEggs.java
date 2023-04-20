package Exam20and21April2019;

import java.util.Scanner;

public class PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String eggsSize = scanner.nextLine();
        String eggsColor = scanner.nextLine();
        int batchCount = Integer.parseInt(scanner.nextLine());
        int batchPrice = 0;

        switch (eggsColor) {
            case "Red":
                if (eggsSize.equals("Large")) {
                    batchPrice = 16;
                } else if (eggsSize.equals("Medium")) {
                    batchPrice = 13;
                } else if (eggsSize.equals("Small")) {
                    batchPrice = 9;
                }
                break;

            case "Green":
                if (eggsSize.equals("Large")) {
                    batchPrice = 12;
                } else if (eggsSize.equals("Medium")) {
                    batchPrice = 9;
                } else if (eggsSize.equals("Small")) {
                    batchPrice = 8;
                }
                break;

            case "Yellow":
                if (eggsSize.equals("Large")) {
                    batchPrice = 9;
                } else if (eggsSize.equals("Medium")) {
                    batchPrice = 7;
                } else if (eggsSize.equals("Small")) {
                    batchPrice = 5;
                }
                break;
        }
        double total = batchCount * batchPrice * 0.65;

        System.out.printf("%.2f leva.", total);
    }
}
