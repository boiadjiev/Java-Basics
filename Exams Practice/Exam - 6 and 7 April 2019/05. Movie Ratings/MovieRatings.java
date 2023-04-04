package Exam6and7April2019;

import java.util.Scanner;

public class MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double maxRating = Double.MIN_VALUE;
        double minRating = Double.MAX_VALUE;
        double totalRating = 0;
        String movieHighestRating = "";
        String movieLowestRating = "";

        for (int i = 1; i <= n; i++) {
            String movieName = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            totalRating += rating;

            if (rating > maxRating) {
                maxRating = rating;
                movieHighestRating = movieName;
            }

            if (rating < minRating) {
                minRating = rating;
                movieLowestRating = movieName;
            }
        }
            System.out.printf("%s is with highest rating: %.1f\n", movieHighestRating, maxRating);
            System.out.printf("%s is with lowest rating: %.1f\n", movieLowestRating, minRating);
            System.out.printf("Average rating: %.1f\n", totalRating / n);
    }
}
