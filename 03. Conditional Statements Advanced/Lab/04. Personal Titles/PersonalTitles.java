package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        String title = "";

        switch (gender) {
            case "m":
                if (age < 16) {
                    title = "Master";
                } else {
                    title = "Mr.";
                }
                break;

            case "f":
                if (age < 16) {
                    title = "Miss";
                } else {
                    title = "Ms.";
                }
                break;
        }

        System.out.println(title);
    }
}
