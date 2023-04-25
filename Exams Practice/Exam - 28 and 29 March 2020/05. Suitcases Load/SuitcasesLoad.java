package Exam28and29March2020;

import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double capacity = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double totalVolume = 0;
        int count = 0;
        boolean noSpace = false;

        while (!input.equals("End")) {
            double volume = Double.parseDouble(input);
            count++;

            if (count % 3 == 0) {
                volume *= 1.1;
            }
            totalVolume += volume;

            if (capacity < totalVolume) {
                noSpace = true;
                count--;
                break;
            }
            input = scanner.nextLine();
        }
        if (noSpace) {
            System.out.println("No more space!");
        } else {
            System.out.println("Congratulations! All suitcases are loaded!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", count);
    }
}
