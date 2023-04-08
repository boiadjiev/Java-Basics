package Exam9and10March2019;

import java.util.Scanner;

public class TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tennisRacketPrice = Double.parseDouble(scanner.nextLine());
        int tennisRacketCount = Integer.parseInt(scanner.nextLine());
        int sneakersCount = Integer.parseInt(scanner.nextLine());

        double sneakersPrice = 1.0 * 1/6 * tennisRacketPrice;
        double totalRacketsAndSneakers = tennisRacketPrice * tennisRacketCount + sneakersPrice * sneakersCount;
        double others = 20 * totalRacketsAndSneakers / 100;
        double total = totalRacketsAndSneakers + others;

        System.out.printf("Price to be paid by Djokovic %.0f\n", Math.floor(1.0 * 1/8 * total));
        System.out.printf("Price to be paid by sponsors %.0f", Math.ceil(1.0 * 7/8 * total));
    }
}
