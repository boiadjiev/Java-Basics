package ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String track = scanner.nextLine();
        double tax = 0;

        switch (track) {
            case "trail":
                tax = juniors * 5.5 + seniors * 7;
                break;
            case "cross-country":
                tax = juniors * 8 + seniors * 9.5;
                if (seniors + juniors >= 50){
                    tax *= 0.75;
                }
                break;
            case "downhill":
                tax = juniors * 12.25 + seniors * 13.75;
                break;
            case "road":
                tax = juniors * 20 + seniors * 21.5;
                break;
        }
        tax *= 0.95;
        System.out.printf("%.2f", tax);
    }
}
