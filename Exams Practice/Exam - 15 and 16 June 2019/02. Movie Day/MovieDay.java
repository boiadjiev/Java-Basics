package Exam15and16June2019;

import java.util.Scanner;

public class MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int shootTime = Integer.parseInt(scanner.nextLine());
        int sceneCount = Integer.parseInt(scanner.nextLine());
        int sceneTime = Integer.parseInt(scanner.nextLine());

        double totalTime = shootTime * 0.15 + sceneCount * sceneTime;

        if (shootTime > totalTime) {
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", shootTime - totalTime);
        } else {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", totalTime - shootTime);
        }
    }
}
