package Exam15and16June2019;

import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String seriesName = scanner.nextLine();
        int seasons = Integer.parseInt(scanner.nextLine());
        int episodes = Integer.parseInt(scanner.nextLine());
        double episodeTime = Double.parseDouble(scanner.nextLine());

        episodeTime *= 1.2;
        double totalTime = episodeTime * episodes * seasons + (seasons * 10);
        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", seriesName, Math.floor(totalTime));
    }
}
