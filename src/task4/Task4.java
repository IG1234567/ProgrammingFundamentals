package task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        // Create Scanner for keyboard input
        Scanner scanner = new Scanner(System.in);

        // Enter the three sides of the triangle
        System.out.print("Enter the length of side a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the length of side b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the length of side c: ");
        double c = scanner.nextDouble();

        // Check if the entered sides can form a valid triangle
        if (a <= 0 || b <= 0 || c <= 0
                || a + b <= c
                || a + c <= b
                || b + c <= a) {
            System.out.println("Error: The side lengths must form a valid triangle.");
        } else {

            // Calculate the semi-perimeter
            double semiPerimeter = (a + b + c) / 2.0;

            // Calculate the area using Heron's formula
            double s = Math.sqrt(semiPerimeter
                    * (semiPerimeter - a)
                    * (semiPerimeter - b)
                    * (semiPerimeter - c));

            // Display the area
            System.out.printf("Triangle area (s): %.2f%n", s);
        }

        scanner.close();
    }
}