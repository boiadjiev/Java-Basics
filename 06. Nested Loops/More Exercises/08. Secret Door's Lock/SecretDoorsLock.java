package NestedLoops.MoreExercises;

import java.util.Scanner;

public class SecretDoorsLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        for (int i1 = 1; i1 <= firstNum; i1++) {

            if (i1 % 2 == 0) {

                for (int i2 = 1; i2 <= secondNum; i2++) {

                    if (i2 == 2 || i2 == 3 || i2 == 5 || i2 == 7) {

                        for (int i3 = 1; i3 <= thirdNum; i3++) {

                            if (i3 % 2 == 0) {

                                System.out.printf("%d %d %d\n", i1, i2, i3);
                            }
                        }
                    }
                }
            }
        }
    }
}
