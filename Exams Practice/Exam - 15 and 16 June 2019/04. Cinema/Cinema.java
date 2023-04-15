package Exam15and16June2019;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hallCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int seatsLeft = hallCapacity;
        int income = 0;
        boolean noSeats = false;

        while (!input.equals("Movie time!")) {
            int people = Integer.parseInt(input);

            if (people > seatsLeft) {
                noSeats = true;
                break;
            }
            income += people * 5;
            seatsLeft -= people;

            if (people % 3 == 0) {
                income -= 5;
            }
            input = scanner.nextLine();
        }

        if (noSeats) {
            System.out.println("The cinema is full.");
        } else {
            System.out.printf("There are %d seats left in the cinema.\n", seatsLeft);
        }
        System.out.printf("Cinema income - %d lv.", income);
    }
}
