package ForLoop.Exercise;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actorName = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String assessorName = scanner.nextLine();
            double assessorPoints = Double.parseDouble(scanner.nextLine());
            points += assessorName.length() * assessorPoints / 2;

            if (points > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, points);
                break;
            }
        }

        if (points < 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - points);
        }
    }
}
