package Exam20and21April2019;

import java.util.Scanner;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eggs = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        String maxColor = "";
        int red = 0;
        int orange = 0;
        int blue = 0;
        int green = 0;

        for (int i = 0; i < eggs; i++) {
            String color = scanner.nextLine();

            switch (color) {
                case "red":
                    red++;
                    if (red > max) {
                        max = red;
                        maxColor = color;
                    }
                    break;

                case "orange":
                    orange++;
                    if (orange > max) {
                        max = orange;
                        maxColor = color;
                    }
                    break;

                case "blue":
                    blue++;
                    if (blue > max) {
                        max = blue;
                        maxColor = color;
                    }
                    break;

                case "green":
                    green++;
                    if (green > max) {
                        max = green;
                        maxColor = color;
                    }
            }
        }
        System.out.printf("Red eggs: %d\nOrange eggs: %d\nBlue eggs: %d\nGreen eggs: %d\nMax eggs: %d -> %s", red, orange, blue, green, max, maxColor);
    }
}
