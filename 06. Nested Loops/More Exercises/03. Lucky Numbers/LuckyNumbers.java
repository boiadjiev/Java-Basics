package NestedLoops.MoreExercises;

import java.util.Scanner;

public class LuckyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i1 = 1; i1 <= 9; i1++) {

            for (int i2 = 1; i2 <= 9; i2++) {

                for (int i3 = 1; i3 <= 9; i3++) {

                    for (int i4 = 1; i4 <= 9; i4++) {

                        if (i1 + i2 == i3 + i4 && n % (i1 + i2) == 0) {

                            System.out.printf("%d%d%d%d ", i1, i2, i3, i4);
                        }
                    }
                }
            }
        }
    }
}
