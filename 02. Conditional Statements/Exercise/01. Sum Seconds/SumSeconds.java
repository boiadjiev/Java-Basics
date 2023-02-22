package ConditionalStatements.Exercise;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timeOne = Integer.parseInt(scanner.nextLine());
        int timeTwo = Integer.parseInt(scanner.nextLine());
        int timeThree  = Integer.parseInt(scanner.nextLine());
        int sumSeconds = timeOne + timeTwo + timeThree;
        int minutes = sumSeconds / 60;
        int seconds = sumSeconds % 60;
        System.out.printf("%d:%02d", minutes, seconds);
    }
}
