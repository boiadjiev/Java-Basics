package ForLoop.MoreExercises;

import java.util.Scanner;
public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int examined = 0;
        int notExamined = 0;
        int doctors = 7;

        for (int i = 1; i <= n; i++) {

            int patientsPerDay = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0 && notExamined > examined) {
                doctors++;
            }

            if (patientsPerDay < doctors) {
                examined += patientsPerDay;

            } else {
                examined += doctors;
                notExamined += patientsPerDay - doctors;
            }
        }
        System.out.printf("Treated patients: %d.\n", examined);
        System.out.printf("Untreated patients: %d.\n", notExamined);
    }
}
