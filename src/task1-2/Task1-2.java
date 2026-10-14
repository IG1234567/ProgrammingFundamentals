package task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        // Create Scanner for keyboard input
        Scanner scanner = new Scanner(System.in);

        // Enter room dimensions
        System.out.print("Enter room length: ");
        int length = scanner.nextInt();

        System.out.print("Enter room width: ");
        int width = scanner.nextInt();

        // Enter tile price per square meter
        System.out.print("Enter tile price: ");
        double price = scanner.nextDouble();

        // Calculate the floor area, add 5% extra tiles, and calculate total cost
        double totalCost = length * width * 1.05 * price;

        // Display the total cost with two decimal places
        System.out.printf("Total tile cost including 5%% extra: %.2f%n", totalCost);

        scanner.close();
    }
}