package Exam6and7July2019;

import java.util.Scanner;

public class TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int max = Integer.MIN_VALUE;
        String mostPowerfulWord = "";

        while (!word.equals("End of words")) {

            int total = 0;
            for (int i = 0; i < word.length(); i++) {
                total += word.charAt(i);
            }
            if (word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u' || word.charAt(0) == 'y' || word.charAt(0) == 'A' || word.charAt(0) == 'E' || word.charAt(0) == 'I' || word.charAt(0) == 'O' || word.charAt(0) == 'U' || word.charAt(0) == 'Y') {
                total *= word.length();
            } else {
                total /= Math.floor(word.length());
            }
            if (total > max) {
                max = total;
            }
            if (total == max) {
                mostPowerfulWord = word;
            }
            word = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %d", mostPowerfulWord, max);
    }
}
