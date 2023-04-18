package Exam18and19July2020;

import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ballsCount = Integer.parseInt(scanner.nextLine());
        double points = 0;
        int redCount = 0;
        int orangeCount = 0;
        int yellowCount = 0;
        int whiteCount = 0;
        int blackCount = 0;
        int otherCount = 0;

        for (int i = 1; i <= ballsCount; i++) {
            String color = scanner.nextLine();

            switch (color) {
                case "red":
                    points += 5;
                    redCount++;
                    break;

                case "orange":
                    points += 10;
                    orangeCount++;
                    break;

                case "yellow":
                    points += 15;
                    yellowCount++;
                    break;

                case "white":
                    points += 20;
                    whiteCount++;
                    break;

                case "black":
                    points = Math.floor(points / 2.0);
                    blackCount++;
                    break;

                default:
                    otherCount++;
            }
        }
        System.out.printf("Total points: %.0f\n", points);
        System.out.printf("Red balls: %d\n", redCount);
        System.out.printf("Orange balls: %d\n", orangeCount);
        System.out.printf("Yellow balls: %d\n", yellowCount);
        System.out.printf("White balls: %d\n", whiteCount);
        System.out.printf("Other colors picked: %d\n", otherCount);
        System.out.printf("Divides from black balls: %d\n", blackCount);
    }
}
