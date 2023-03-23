package WhileLoop.Exercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stepsSum = 0;

        while (stepsSum < 10000) {

            String steps = scanner.nextLine();

            if (steps.equals("Going home")) {
                steps = scanner.nextLine();
                stepsSum += Integer.parseInt(steps);
                break;
            }
            stepsSum += Integer.parseInt(steps);
        }
        if (stepsSum >= 10000) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", stepsSum - 10000);
        } else {
            System.out.printf("%d more steps to reach goal.", 10000 - stepsSum);
        }
    }
}
