package task3_6;

import java.util.Scanner;

public class Task3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer N (at least 2): ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Error: N must be at least 2.");
        } else {
            System.out.println("Prime numbers:");
            boolean firstPrime = true;

            for (long number = 2; number <= n; number++) {
                boolean isPrime = true;
                for (long divisor = 2; divisor <= number / divisor; divisor++) {
                    if (number % divisor == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    if (!firstPrime) {
                        System.out.print(" ");
                    }
                    System.out.print(number);
                    firstPrime = false;
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
