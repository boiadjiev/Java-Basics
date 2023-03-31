package NestedLoops.MoreExercises;

import java.util.Scanner;

public class CarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.next());

        for (int i1 = startNum; i1 <= endNum; i1++) {

            for (int i2 = startNum; i2 <= endNum; i2++) {

                for (int i3 = startNum; i3 <= endNum; i3++) {

                    for (int i4 = startNum; i4 <= endNum; i4++) {

                        if (((i1 % 2 == 0 && i4 % 2 != 0) || (i1 % 2 != 0 && i4 % 2 == 0)) && i1 > i4 && ((i2 + i3) % 2 == 0)) {

                            System.out.printf("%d%d%d%d ", i1, i2, i3, i4);
                        }
                    }
                }
            }
        }
    }
}
