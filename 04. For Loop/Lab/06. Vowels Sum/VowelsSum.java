package ForLoop.Lab;

import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int total = 0;

        for (int i = 0; i < text.length(); i++) {

            switch (text.charAt(i)) {
                case 'a':
                    total += 1;
                    break;
                case 'e':
                    total += 2;
                    break;
                case 'i':
                    total += 3;
                    break;
                case 'o':
                    total += 4;
                    break;
                case 'u':
                    total += 5;
                    break;
            }
        }
        System.out.println(total);
    }
}
