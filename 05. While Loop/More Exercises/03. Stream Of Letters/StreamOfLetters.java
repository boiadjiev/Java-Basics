package WhileLoop.MoreExercises;

import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String word = "";
        String print = "";
        int countC = 0;
        int countO = 0;
        int countN = 0;

        while (!input.equals("End")) {

            char x = input.charAt(0);

            if ((x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z')) {

                if ((x == 'c' || x == 'o' || x == 'n') && (countC == 0 || countO == 0 || countN == 0)) {

                    switch (x) {

                        case 'c':
                            if (countC == 1) {
                                word += x;
                            } else {
                                countC++;
                            }
                            break;

                        case 'o':
                            if (countO == 1) {
                                word += x;
                            } else {
                                countO++;
                            }
                            break;

                        case 'n':
                            if (countN == 1) {
                                word += x;
                            } else {
                                countN++;
                            }
                            break;}
                } else {
                    word += x;
                }

                if ((x == 'c' || x == 'o' || x == 'n') && (countC == 1 && countO == 1 && countN == 1)) {

                    word += " ";
                    print += word;
                    countC = 0;
                    countO = 0;
                    countN = 0;
                    word = "";
                }
            }
            input = scanner.nextLine();
        }
        System.out.println(print);
    }
}
