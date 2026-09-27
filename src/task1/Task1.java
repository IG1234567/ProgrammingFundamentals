package task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        // Create Scanner to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Read the average number of books read per month
        System.out.print("Enter average books read per month (v): ");
        int v = scanner.nextInt();

        // Read the average number of library visitors per year
        System.out.print("Enter average visitors per year (n): ");
        int n = scanner.nextInt();

        // Check that the number of visitors is valid
        if (n <= 0) {
            System.out.println("Error: Number of visitors must be greater than zero.");
        } else {
            // Calculate the average number of books read by one visitor per year
            double k = (12.0 * v) / n;

            // Display the result rounded to two decimal places
            System.out.printf("Average books read per visitor per year (k): %.2f%n", k);
        }

        // Close the Scanner
        scanner.close();
    }
}