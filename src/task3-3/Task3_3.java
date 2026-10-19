package task3_3;

import java.util.Scanner;

public class Task3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer N between 0 and 12: ");
        int n = scanner.nextInt();

        if (n < 0 || n > 12) {
            System.out.println("Error: N must be between 0 and 12.");
        } else {
            long factorial = 1;
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            System.out.println(n + "! = " + factorial);
        }

        scanner.close();
    }
}
