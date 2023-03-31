package NestedLoops.MoreExercises;

import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char start = scanner.nextLine().charAt(0);
        char end  = scanner.nextLine().charAt(0);
        char skip = scanner.nextLine().charAt(0);
        int count = 0;

        for (char i1 = start; i1 <= end; i1++) {

            for (char i2 = start; i2 <= end; i2++) {

                for(char i3 = start; i3 <= end; i3++) {

                    if (i1 != skip && i2 != skip && i3 != skip) {

                        System.out.print("" + i1 + i2 + i3 + " ");
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
