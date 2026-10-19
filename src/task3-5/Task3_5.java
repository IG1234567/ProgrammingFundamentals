package task3_5;

import java.util.Scanner;

public class Task3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter height: ");
        int height = scanner.nextInt();

        System.out.print("Enter width: ");
        int width = scanner.nextInt();

        if (height < 2 || width < 2) {
            System.out.println("Error: Height and width must both be at least 2.");
        } else {
            for (int row = 1; row <= height; row++) {
                for (int column = 1; column <= width; column++) {
                    if (row == 1 || row == height || column == 1 || column == width) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}
