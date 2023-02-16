package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        double aquariumVolumeCm3 = length * width * height;
        double aquariumVolumeLiters = aquariumVolumeCm3 / 1000;
        double occupiedVolume = aquariumVolumeLiters * percent / 100;
        double water = aquariumVolumeLiters - occupiedVolume;
        System.out.println(water);
    }
}
