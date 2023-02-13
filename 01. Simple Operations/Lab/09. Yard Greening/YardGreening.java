package FirstStepsInCoding.Lab;

import java.util.Scanner;
public class YardGreening {
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double squareMeters = Double.parseDouble(scanner.nextLine());
        double totalSquareMeters = squareMeters * 7.61;
        double discount = totalSquareMeters * 0.18;
        double total = totalSquareMeters - discount;
        System.out.printf("The final price is: %.2f lv.\n", total);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
