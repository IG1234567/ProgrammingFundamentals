package task3_2;

import java.util.Scanner;

public class Task3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer N: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Error: N must be a positive integer.");
        } else {
            System.out.println("Even numbers:");
            int count = 0;
            for (long i = 2; i <= n; i += 2) {
                if (count > 0) {
                    System.out.print(" ");
                }
                System.out.print(i);
                count++;
            }
            System.out.println();
            System.out.println("Count: " + count);
        }

        scanner.close();
    }
}
