package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vegetablesPrice = Double.parseDouble(scanner.nextLine());
        double fruitsPrice = Double.parseDouble(scanner.nextLine());
        int totalKgVegetables = Integer.parseInt(scanner.nextLine());
        int totalKgFruits = Integer.parseInt(scanner.nextLine());
        double totalLvVegetables = vegetablesPrice * totalKgVegetables;
        double totalLvFruits = fruitsPrice * totalKgFruits;
        double totalLv = totalLvVegetables + totalLvFruits;
        double totalEuro = totalLv / 1.94;
        System.out.printf("%.2f", totalEuro);
    }
}
