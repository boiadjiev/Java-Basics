package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegan = Integer.parseInt(scanner.nextLine());
        double menus = (chicken * 10.35) + (fish * 12.40) + (vegan * 8.15);
        double desserts = menus * 0.2;
        double total = menus + desserts + 2.50;
        System.out.println(total);
    }
}
