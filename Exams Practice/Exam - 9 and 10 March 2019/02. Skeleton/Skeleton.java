package Exam9and10March2019;

import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int controlMin = Integer.parseInt(scanner.nextLine());
        int controlSec = Integer.parseInt(scanner.nextLine());
        double runway = Double.parseDouble(scanner.nextLine());
        int secFor100m = Integer.parseInt(scanner.nextLine());

        int controlTime = controlMin * 60 + controlSec;
        double reductionTime = runway / 120 * 2.5;
        double marinTime = runway / 100 * secFor100m - reductionTime;

        if (controlTime >= marinTime) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", marinTime);
        } else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", marinTime - controlTime);
        }
    }
}
