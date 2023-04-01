package NestedLoops.MoreExercises;

import java.util.Scanner;

public class SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int xLast = Integer.parseInt(scanner.nextLine());
        int yLast = Integer.parseInt(scanner.nextLine());
        int max = Integer.parseInt(scanner.nextLine());
        int count = 0;
        char a = 35;
        char b = 64;

        while (a <= 55) {

            while (b <= 96) {

                for (int x = 1; x <= xLast; x++) {

                    for (int y = 1; y <= yLast; y++) {

                        System.out.printf("%c%c%d%d%c%c|", a, b, x, y, b, a);

                        count++;
                        a++;
                        b++;

                        if (count >= max || x == xLast && y == yLast) {
                            return;
                        }
                        if (a > 55) {
                            a = 35;
                        }
                        if (b > 96) {
                            b = 64;
                        }
                    }
                }
            }
        }
    }
}
