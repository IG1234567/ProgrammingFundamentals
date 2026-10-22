package task2_1;

import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (year >= 1896 && (year - 1896) % 4 == 0) {
            int edition = (year - 1896) / 4 + 1;
            System.out.println("Year " + year + " is an Olympic year.");
            System.out.println("It is the " + edition + ordinalSuffix(edition) + " Olympic Games.");
        } else {
            System.out.println("Year " + year + " is not an Olympic year.");
        }

        scanner.close();
    }

    private static String ordinalSuffix(int number) {
        int lastTwoDigits = number % 100;
        if (lastTwoDigits >= 11 && lastTwoDigits <= 13) {
            return "th";
        }

        switch (number % 10) {
            case 1:
                return "st";
            case 2:
                return "nd";
            case 3:
                return "rd";
            default:
                return "th";
        }
    }
}
