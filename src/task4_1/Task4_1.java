package task4_1;

import java.util.Scanner;

public class Task4_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter laptop price (p): ");
        int p = in.nextInt();

        System.out.print("Enter current savings (s): ");
        int s = in.nextInt();

        System.out.print("Enter weekly savings (m): ");
        int m = in.nextInt();

        int k = 0;

        while (s < p && m > 0) {
            s += m;
            k++;
        }

        if (s >= p) {
            System.out.println("Weeks needed (k): " + k);
        } else {
            System.out.println("Error: Weekly savings must be greater than zero.");
        }

        in.close();
    }
}
