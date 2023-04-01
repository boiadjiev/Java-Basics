package NestedLoops.MoreExercises;

import java.util.Scanner;

public class ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int men = Integer.parseInt(scanner.nextLine());
        int women = Integer.parseInt(scanner.nextLine());
        int tables = Integer.parseInt(scanner.nextLine());
        int count = 0;

        for (int i1 = 1; i1 <= men; i1++) {

            for (int i2 = 1; i2 <= women; i2++) {
                count++;

                if (tables >= count) {

                    System.out.printf("(%d <-> %d) ", i1, i2);
                }
            }
        }
    }
}
