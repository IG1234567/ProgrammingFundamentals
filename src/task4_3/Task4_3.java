package task4_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task4_3 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(new File("ProgrammingFundamentals/src/task4_3/data.txt"));

        int n = in.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {
            int temperature = in.nextInt();

            if (temperature < 0) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No negative temperatures recorded");
        } else {
            System.out.println("Days with negative temperatures: " + count);
        }

        in.close();
    }
}
