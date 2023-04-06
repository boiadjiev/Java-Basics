package Exam6and7July2019;

import java.util.Scanner;

public class TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        String paket = scanner.nextLine();
        String vip = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double price = 0.0;
        boolean invalid = false;
        if (days > 7) {
            days--;
        }
        switch (city) {
            case "Bansko":
            case "Borovets":
                if ("withEquipment".equals(paket)) {
                    price = days * 100;
                    if (vip.equals("yes")) {
                        price *= 0.9;
                    }
                } else if ("noEquipment".equals(paket)) {
                    price = days * 80;
                    if (vip.equals("yes")) {
                        price *= 0.95;
                    }
                } else {
                    invalid = true;
                }
                break;
            case "Varna":
            case "Burgas":
                if ("withBreakfast".equals(paket)) {
                    price = days * 130;
                    if (vip.equals("yes")) {
                        price *= 0.88;
                    }
                } else if ("noBreakfast".equals(paket)) {
                    price = days * 100;
                    if (vip.equals("yes")) {
                        price *= 0.93;
                    }
                } else {
                    invalid = true;
                }
                break;
            default:
                invalid = true;
                break;
        }
        if (invalid) {
            System.out.println("Invalid input!");
        } else if (days < 1) {
            System.out.println("Days must be positive number!");
        } else {
            System.out.printf("The price is %.2flv! Have a nice time!", price);
        }
    }
}
