package ForLoop.MoreExercises;

import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stadium = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());
        int a = 0;
        int b = 0;
        int v = 0;
        int g = 0;

        for (int i = 0; i < fans; i++) {

            String sector = scanner.nextLine();

            switch (sector) {
                case "A":
                    a += 1;
                    break;
                case "B":
                    b += 1;
                    break;
                case "V":
                    v += 1;
                    break;
                case "G":
                    g += 1;
                    break;
            }
        }
        System.out.printf("%.2f%%\n", a * 1.0 / fans * 100);
        System.out.printf("%.2f%%\n", b * 1.0 / fans * 100);
        System.out.printf("%.2f%%\n", v * 1.0 / fans * 100);
        System.out.printf("%.2f%%\n", g * 1.0 / fans * 100);
        System.out.printf("%.2f%%\n", fans * 1.0 / stadium * 100);
    }
}
