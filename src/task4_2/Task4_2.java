package task4_2;

import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int even = 0;
        int odd = 0;

        System.out.print("Enter a number (0 to stop): ");
        int n = in.nextInt();

        while (n != 0) {

            if (n % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            System.out.print("Enter a number (0 to stop): ");
            n = in.nextInt();
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

        in.close();
    }
}