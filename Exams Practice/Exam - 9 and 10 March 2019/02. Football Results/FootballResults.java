package Exam9and10March2019;

import java.util.Scanner;

public class FootballResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int won = 0;
        int lost = 0;
        int drawn = 0;

        for (int i = 1; i <= 3; i++) {
            String result = scanner.nextLine();
            int team = Integer.parseInt("" + result.charAt(0));
            int guest = Integer.parseInt("" + result.charAt(2));

            if (team > guest) {
                won++;
            } else if (guest > team) {
                lost++;
            } else {
                drawn++;
            }
        }
        System.out.printf("Team won %d games.\n", won);
        System.out.printf("Team lost %d games.\n", lost);
        System.out.printf("Drawn games: %d\n", drawn);
    }
}
