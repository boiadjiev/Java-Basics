package Exam6and7April2019;

import java.util.Scanner;

public class CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int voucher = Integer.parseInt(scanner.nextLine());
        String purchase = scanner.nextLine();
        int price = 0;
        int tickets = 0;
        int others = 0;

        while (!purchase.equals("End")) {

            int letter1 = purchase.charAt(0);
            int letter2 = purchase.charAt(1);
            int length = purchase.length();

            if (length > 8) {
                price = letter1 + letter2;
            } else  {
                price = letter1;
            }

            if (voucher - price >= 0) {
                voucher -= price;
                if (length > 8) {
                    tickets++;
                } else {
                    others++;
                }
            } else {
                break;
            }
            purchase = scanner.nextLine();
        }
        System.out.printf("%d\n%d", tickets, others);
    }
}
