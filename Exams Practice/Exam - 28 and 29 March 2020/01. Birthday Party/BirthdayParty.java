package Exam28and29March2020;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rent = Double.parseDouble(scanner.nextLine());

        double cake = rent * 0.2;
        double drinks = cake * 0.55;
        double animator = 1.0 / 3 * rent;
        System.out.println(rent + cake + drinks + animator);
    }
}
