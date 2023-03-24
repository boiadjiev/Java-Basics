package WhileLoop.Exercise;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        int freeSpace = x * y * z;
        boolean done = false;

        while (freeSpace > 0) {

            String box = scanner.nextLine();

            if (box.equals("Done")) {
                done = true;
                break;
            } else {
                freeSpace -= Integer.parseInt(box);
            }
        }
        if (done) {
            System.out.printf("%d Cubic meters left.", freeSpace);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(freeSpace));
        }
    }
}
