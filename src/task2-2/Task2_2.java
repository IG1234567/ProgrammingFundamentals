package task2_2;

import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int h = scanner.nextInt();

        System.out.print("Enter minutes: ");
        int m = scanner.nextInt();

        System.out.print("Enter seconds: ");
        int s = scanner.nextInt();

        s++;
        if (s == 60) {
            s = 0;
            m++;
            if (m == 60) {
                m = 0;
                h++;
                if (h == 24) {
                    h = 0;
                }
            }
        }

        System.out.printf("One second later: %02d:%02d:%02d%n", h, m, s);

        scanner.close();
    }
}
