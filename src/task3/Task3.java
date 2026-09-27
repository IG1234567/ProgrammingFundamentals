package task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        // Create Scanner for keyboard input
        Scanner scanner = new Scanner(System.in);

        // Enter coordinates of the upper-left corner
        System.out.print("Enter x1 (upper-left x): ");
        int x1 = scanner.nextInt();

        System.out.print("Enter y1 (upper-left y): ");
        int y1 = scanner.nextInt();

        // Enter coordinates of the lower-right corner
        System.out.print("Enter x2 (lower-right x): ");
        int x2 = scanner.nextInt();

        System.out.print("Enter y2 (lower-right y): ");
        int y2 = scanner.nextInt();

        // Calculate the width and height of the rectangle
        int width = Math.abs(x2 - x1);
        int height = Math.abs(y2 - y1);

        // Calculate the area and perimeter
        int s = width * height;
        int p = 2 * (width + height);

        // Display the results
        System.out.println("Area (s) = " + s);
        System.out.println("Perimeter (p) = " + p);

        scanner.close();
    }
}