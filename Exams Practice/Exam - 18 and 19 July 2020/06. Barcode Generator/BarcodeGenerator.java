package Exam18and19July2020;

import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firsNumber = Integer.parseInt(scanner.nextLine());
        int lastNumber = Integer.parseInt(scanner.nextLine());

        int n4Start = firsNumber % 10;
        int n3Start = (firsNumber / 10) % 10;
        int n2Start = (firsNumber / 100) % 10;
        int n1Start = firsNumber / 1000;

        int n4End = lastNumber % 10;
        int n3End = (lastNumber / 10) % 10;
        int n2End = (lastNumber / 100) % 10;
        int n1End = lastNumber / 1000;

        for (int i1 = n1Start; i1 <= n1End; i1++) {
            for(int i2 = n2Start; i2 <= n2End; i2++) {
                for (int i3 = n3Start; i3 <= n3End; i3++) {
                    for (int i4 = n4Start; i4 <= n4End; i4++) {

                        if (i1 % 2 != 0 && i2 % 2 != 0 && i3 % 2 != 0 && i4 % 2 != 0) {
                            System.out.printf("%d%d%d%d ", i1, i2, i3, i4);
                        }
                    }
                }
            }
        }
    }
}
