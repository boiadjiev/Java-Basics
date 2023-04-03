package NestedLoops.MoreExercises;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for (int i1 = 1; i1 <= n; i1++) {

            for (int i2 = 1; i2 <= n; i2++) {

                for (char i3 = 'a'; i3 < 'a' + l; i3++) {

                    for (char i4 = 'a'; i4 < 'a' + l; i4++) {

                        for (int i5 = Math.max(i1, i2) + 1; i5 <= n; i5++) {

                            System.out.printf("%d%d%c%c%d ", i1, i2, i3, i4, i5);

                        }
                    }
                }
            }
        }
    }
}
