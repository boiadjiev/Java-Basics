package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        boolean error = false;
        double price = 0;

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (fruit) {
                    case "banana":
                        price = amount * 2.5;
                        break;
                    case "apple":
                        price = amount * 1.2;
                        break;
                    case "orange":
                        price = amount * 0.85;
                        break;
                    case "grapefruit":
                        price = amount * 1.45;
                        break;
                    case "kiwi":
                        price = amount * 2.7;
                        break;
                    case "pineapple":
                        price = amount * 5.5;
                        break;
                    case "grapes":
                        price = amount * 3.85;
                        break;
                    default:
                        error = true;
                        break;
                }
                break;

            case "Saturday":
            case "Sunday":
                switch (fruit) {
                    case "banana":
                        price = amount * 2.7;
                        break;
                    case "apple":
                        price = amount * 1.25;
                        break;
                    case "orange":
                        price = amount * 0.9;
                        break;
                    case "grapefruit":
                        price = amount * 1.6;
                        break;
                    case "kiwi":
                        price = amount * 3.0;
                        break;
                    case "pineapple":
                        price = amount * 5.6;
                        break;
                    case "grapes":
                        price = amount * 4.2;
                        break;
                    default:
                        error = true;
                        break;
                }
                break;

            default:
                error = true;
                break;
        }

        if (error) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f",price);
        }
    }
}
