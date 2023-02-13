package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogFood = Integer.parseInt(scanner.nextLine());
        int catFood = Integer.parseInt(scanner.nextLine());
        double totalDogFood = dogFood * 2.5;
        double totalCatFood = catFood * 4;
        double total = totalDogFood + totalCatFood;
        System.out.printf(total + " lv.");
    }
}
