package WhileLoop.Exercise;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = Double.parseDouble(scanner.nextLine());
        int coinsCount = 0;

        double sumSt = Math.round(sum * 100);

        while (sumSt > 0) {

            if (sumSt >= 200) {
                coinsCount++;
                sumSt -= 200;
            } else if (sumSt >= 100) {
                coinsCount++;
                sumSt -= 100;
            } else if (sumSt >= 50) {
                coinsCount++;
                sumSt -= 50;
            } else if (sumSt >= 20) {
                coinsCount++;
                sumSt -= 20;
            } else if (sumSt >= 10) {
                coinsCount++;
                sumSt -= 10;
            } else if (sumSt >= 5) {
                coinsCount++;
                sumSt -= 5;
            } else if (sumSt >= 2) {
                coinsCount++;
                sumSt -= 2;
            } else if (sumSt >= 1) {
                coinsCount++;
                sumSt -= 1;
            }
        }
        System.out.println(coinsCount);
    }
}
