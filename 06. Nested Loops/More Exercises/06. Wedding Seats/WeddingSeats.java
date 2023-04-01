package NestedLoops.MoreExercises;

import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char lastSector = scanner.nextLine().charAt(0);
        int rowsInFirstSector = Integer.parseInt(scanner.nextLine());
        int seatsInOddRows = Integer.parseInt(scanner.nextLine());
        int seatCount = 0;

        for (char sector = 'A'; sector <= lastSector; sector++) {
            int rows = rowsInFirstSector + sector - 'A';

            for (int row = 1; row <= rows; row++) {
                int seats = seatsInOddRows;

                if (row % 2 == 0) {
                    seats += 2;
                }

                for (char seat = 'a'; seat < 'a' + seats; seat++) {
                    System.out.printf("%c%d%c\n", sector, row, seat);
                    seatCount++;
                }
            }
        }
        System.out.println(seatCount);
    }
}
