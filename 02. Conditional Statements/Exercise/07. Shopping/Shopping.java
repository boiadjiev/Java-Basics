package ConditionalStatements.Exercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int gpus = Integer.parseInt(scanner.nextLine());
        int cpus = Integer.parseInt(scanner.nextLine());
        int rams = Integer.parseInt(scanner.nextLine());
        double gpuPrice = 250;
        double cpuPrice = gpus * gpuPrice * 0.35;
        double ramPrice = gpus * gpuPrice * 0.1;
        double total = gpus * gpuPrice + cpus * cpuPrice + rams * ramPrice;
        if (gpus > cpus) {
            total = total - total * 0.15;
        }
        double diff = Math.abs(budget - total);
        if (budget >= total) {
            System.out.printf("You have %.2f leva left!", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }
    }
}
