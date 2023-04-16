package Exam15and16June2019;

import java.util.Scanner;

public class FavoriteMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        int movieCount = 0;
        int maxPoints = Integer.MIN_VALUE;
        String bestMovie = "";

        while (!movie.equals("STOP")) {
            movieCount++;
            int points = 0;

            if (movieCount == 7) {
                System.out.println("The limit is reached.");
                break;
            }

            for (int i = 0; i < movie.length(); i++) {
                points += movie.charAt(i);

                if (movie.charAt(i) >= 'a' && movie.charAt(i) <= 'z') {
                    points -= 2 * movie.length();
                } else if (movie.charAt(i) >= 'A' && movie.charAt(i) <= 'Z') {
                    points -= movie.length();
                }
            }

            if (points > maxPoints) {
                maxPoints = points;
                bestMovie = movie;
            }
            movie = scanner.nextLine();
        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.", bestMovie, maxPoints);
    }
}
