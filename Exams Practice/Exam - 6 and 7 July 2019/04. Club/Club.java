package Exam6and7July2019;

import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double target = Double.parseDouble(scanner.nextLine());
        double income = 0;
        boolean isParty = false;

        while (target > income) {

            String cocktail = scanner.nextLine();

            if (cocktail.equals("Party!")) {
                isParty = true;
                break;
            }

            int cocktailCount = Integer.parseInt(scanner.nextLine());
            double orderPrice = cocktailCount * cocktail.length();
            if (orderPrice % 2 != 0) {
                orderPrice *= 0.75;
            }
            income += orderPrice;
        }

        if (isParty) {
            System.out.printf("We need %.2f leva more.\n", target - income);
        } else {
            System.out.println("Target acquired.");
        }
        System.out.printf("ProgrammingBasicsOnlineExam._6and7July2019.Club income - %.2f leva.", income);
    }
}
