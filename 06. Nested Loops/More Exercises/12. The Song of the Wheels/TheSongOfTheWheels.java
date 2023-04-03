package NestedLoops.MoreExercises;

import java.util.Scanner;

public class TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int control = Integer.parseInt(scanner.nextLine());
        int count = 0;
        String password = "";
        boolean isFound = false;

        for (int a = 1; a <= 9; a++) {

            for (int b = 1; b <= 9; b++) {

                for (int c = 1; c <= 9; c++) {

                    for (int d = 1; d <= 9; d++) {

                        if (a < b && c > d && control == a * b + c * d) {

                            count++;
                            System.out.printf("%d%d%d%d ", a, b, c, d);

                            if (count == 4) {
                                password = "" + a + b + c + d;
                                isFound = true;
                            }
                        }
                    }
                }
            }
        }
        if (isFound) {
            System.out.printf("\nPassword: %s", password);
        } else {
            System.out.print("\nNo!");
        }
    }
}
