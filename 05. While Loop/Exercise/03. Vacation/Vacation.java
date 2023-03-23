package WhileLoop.Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vacationMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());
        int spendCount = 0;
        int daysCount = 0;
        boolean cantSave = false;

        while (availableMoney < vacationMoney) {

            daysCount++;
            String action = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());

            switch (action) {

                case "spend":
                    spendCount++;
                    availableMoney -= amount;
                    if (availableMoney < 0) {
                        availableMoney = 0;
                    }
                    break;
                case "save":
                    spendCount = 0;
                    availableMoney += amount;
                    break;
            }
            if (spendCount == 5) {
                cantSave = true;
                break;
            }
        }
        if (cantSave) {
            System.out.println("You can't save the money.");
            System.out.println(daysCount);
        } else {
            System.out.printf("You saved the money for %d days.", daysCount);
        }
    }
}
