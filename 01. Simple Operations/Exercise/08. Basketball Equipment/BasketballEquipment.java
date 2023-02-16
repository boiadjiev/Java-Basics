package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double annualFee = Double.parseDouble(scanner.nextLine());
        double sneakers = annualFee - annualFee * 0.4;
        double outfit = sneakers - sneakers * 0.2;
        double ball = 1/4d * outfit;
        double accessors = 1/5d * ball;
        double expenses = annualFee + sneakers + outfit + ball + accessors;
        System.out.println(expenses);
    }
}
