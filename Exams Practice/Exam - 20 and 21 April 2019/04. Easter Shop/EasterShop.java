package Exam20and21April2019;

import java.util.Scanner;

public class EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eggsStock = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int totalBuyEggs = 0;

        while (!input.equals("Close")) {
            int eggs = Integer.parseInt(scanner.nextLine());

            switch (input) {
                case "Buy":
                    totalBuyEggs += eggs;
                    if (eggs > eggsStock) {
                        System.out.printf("Not enough eggs in store!\nYou can buy only %d.", eggsStock);
                        return;
                    }
                    eggsStock -= eggs;
                    break;
                case "Fill":
                    eggsStock += eggs;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Store is closed!\n%d eggs sold.", totalBuyEggs);
    }
}
