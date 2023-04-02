package NestedLoops.MoreExercises;

import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money1lv = Integer.parseInt(scanner.nextLine());
        int money2lv = Integer.parseInt(scanner.nextLine());
        int money5lv = Integer.parseInt(scanner.nextLine());
        int amount = Integer.parseInt(scanner.nextLine());

        for (int i1 = 0; i1 <= money1lv; i1++) {

            for (int i2 = 0; i2 <= money2lv; i2++) {

                for (int i5 = 0; i5 <= money5lv; i5++) {

                    if(i1 + i2 * 2 + i5 * 5 == amount) {

                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.\n", i1, i2, i5, amount);
                    }
                }
            }
        }
    }
}
