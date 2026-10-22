package task4_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task4_4 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(new File("ProgrammingFundamentals/src/task4_4/duomenys.txt"));

        int n = in.nextInt();

        int previous = in.nextInt();

        int count = 0;

        for (int i = 1; i < n; i++) {

            int current = in.nextInt();

            if (current < previous) {
                count++;
            }

            previous = current;
        }

        System.out.println("Count: " + count);

        in.close();
    }
}