package Exam15and16June2019;

import java.util.Scanner;

public class MovieTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = Integer.parseInt(scanner.nextLine());
        int a2 = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i1 = a1; i1 <= a2 - 1; i1++) {

            for (int i2 = 1; i2 <= n - 1; i2++) {

                for (int i3 = 1; i3 <= n / 2 - 1; i3++) {

                    if (i1 % 2 != 0 && (i2  + i3 + i1) % 2 != 0) {

                        System.out.printf("%c-%d%d%d\n", i1, i2, i3, i1);
                    }
                }
            }
        }
    }
}
